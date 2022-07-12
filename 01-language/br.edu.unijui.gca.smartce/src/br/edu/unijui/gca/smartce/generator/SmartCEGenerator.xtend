/*
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import br.edu.unijui.gca.smartce.smartCE.Contract
import java.sql.Timestamp
import br.edu.unijui.gca.smartce.smartCE.Timeout
import br.edu.unijui.gca.smartce.smartCE.Condition
import br.edu.unijui.gca.smartce.smartCE.BusinessDay
import br.edu.unijui.gca.smartce.smartCE.OperationLimit
import br.edu.unijui.gca.smartce.smartCE.MessageContent
import br.edu.unijui.gca.smartce.smartCE.TimeInterval

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SmartCEGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (c : resource.allContents.filter(Contract).toIterable) {
			fsa.generateFile(c.name + '.sol', generateSolCode(c))
		}
	}

	def generateSolCode(Contract c) {
		'''
			//SPDX-License-Identifier: MIT
			pragma solidity ^0.8.14;
			
			import "./libs/EAI_Domain.sol";
			
			contract «c.name» is EAI_Domain{
				uint32 beginDate = «getTS(c.beginDate)»;
				uint32 dueDate = «getTS(c.dueDate)»;
				
				Party «c.application.name»;
				Party «c.process.name»;
				
				«getConditions(c.clauses.get(0).condition)»
				
				event «c.clauses.get(0).onBreach.action.name»(string _logMessage);
				
				constructor(address _applicationWallet, address _processWallet){
			    	«c.application.name» = Party("«c.process.description» ", _applicationWallet);
				    «c.process.name» = Party("«c.process.description»", _processWallet);
				}
				
				function «c.clauses.get(0).name»(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
								
					require(_performer == «c.clauses.get(0).rolePlayer.name».walletAddress, "You have no permission to perform this operation.");
					bool isBreached=false;
					
					if(«getConditionals(c.clauses.get(0).condition)») {
						operationLimit.requestsPerformed+=1;
			        	return true;	
					}
					
					emit «c.clauses.get(0).onBreach.action.name» ("Request made outside of allowed hours or distance limit exceeded");
					return false;
				}
			}
		'''
	}

	def getTS(String date){
		return (Timestamp.valueOf(date).getTime()/1000);
	}
	
	def getConditions(Condition condition){
		'''
			«FOR c: condition.eAllContents.toIterable»
				«IF(c instanceof Timeout)»
					Timeout public timeout = Timeout(«c.value», 0);
				«ELSEIF(c instanceof BusinessDay)»
					BusinessDay public businessDay = BusinessDay(«c.start», «c.end»);
				«ELSEIF(c instanceof TimeInterval)»
					TimeInterval public timeInterval = TimeInterval(«c.start», «c.end»);
				«ELSEIF(c instanceof OperationLimit)»
					OperationLimit public operationLimit = OperationLimit(«c.operationsNumber», «c.timeUnit», 0, 0);
				«ELSEIF(c instanceof MessageContent)»
					MessageContent public messageContent = MessageContent("«c.content»");
				«ENDIF»
			«ENDFOR»
		'''
	}
	
	def getConditionals(Condition condition){
		'''	
		«FOR c: condition.eAllContents.toIterable»
			«IF(c instanceof Timeout)»
				!isTimeout(_accessDateTime, timeout.endTime) &&
			«ELSEIF(c instanceof BusinessDay)»
				isBusinessDay(_accessDateTime, businessDay) &&
			«ELSEIF(c instanceof TimeInterval)»
				isIntoTimeInterval(_accessDateTime, timeInterval) &&
			«ELSEIF(c instanceof OperationLimit)»
				!isOperationLimitReached(_accessDateTime, operationLimit) &&
			«ENDIF»
		«ENDFOR»
		'''
	}
	
}
