/*
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.sql.Timestamp

import br.edu.unijui.gca.jabuti.jabuti.Contract

import br.edu.unijui.gca.jabuti.jabuti.Timeout
import br.edu.unijui.gca.jabuti.jabuti.Terms
import br.edu.unijui.gca.jabuti.jabuti.WeekDaysInterval
import br.edu.unijui.gca.jabuti.jabuti.MaxNumberOfOperation
import br.edu.unijui.gca.jabuti.jabuti.MessageContent
import br.edu.unijui.gca.jabuti.jabuti.TimeInterval
import java.util.Map
import java.util.ArrayList
import br.edu.unijui.gca.jabuti.jabuti.Variable
import br.edu.unijui.gca.jabuti.jabuti.SessionInterval
import br.edu.unijui.gca.jabuti.jabuti.Term

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class JabutiGenerator extends AbstractGenerator {

//	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
////		fsa.generateFile('greetings.txt', 'People to greet: ' + 
////			resource.allContents
////				.filter(Greeting)
////				.map[name]
////				.join(', '))
//	}
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (c : resource.allContents.filter(Contract).toIterable) {
			fsa.generateFile(c.name + '.sol', generateSolCode(c))
		}
	}

	def generateSolCode(Contract ct) {
		'''		
			//SPDX-License-Identifier: MIT
			pragma solidity ^0.8.14;
			
			import "./libs/EAI_Domain.sol";
			
			contract «ct.name» is EAI_Domain{
				
				uint32 beginDate; 
				uint32 dueDate; 	
				using EAI for EAI.Party;
				       
				EAI.Party application;
				EAI.Party process;
				mapping(address=>EAI.Party) mapParty;
				
				event failEvent(string _logMessage);
				event successEvent(string _logMessage);
				/* --------------------------- END: commom code for all contracts ----------------------- */  
				
				/* =========== BEGIN: codes generated based in specific jabuti contract =================== */
				    	
				//  1º STEP:  Import library to conditions/terms  ----------------------------------             
				    
				    
				      
			«IF ct !== null»
				«val variableTerms = ct.getVariableTerms»

				«FOR f : variableTerms»			    				    	
					using EAI for EAI.«f»				   	
				«ENDFOR»
				
			«ENDIF»

		'''
	// ----------------------------------------------------------------------------------
	}

	def static ArrayList<String> getVariableTerms(Contract ct) {
		val result = newArrayList
		if (ct.variables !== null) {
			ct.variables.forEach [ variable |
				if (variable.term !== null) {
					val termType = variable.term.getTermType
					result.add(termType)
				}
			]
		}
		return result
	}

	def static String getTermType(Term tm) {
		
		// WeekDaysInterval | TimeInterval | Timeout
		val termType = tm.eClass().getName()
		if(termType.equalsIgnoreCase("WeekDaysInterval") || termType.equalsIgnoreCase("TimeInterval") || termType.equalsIgnoreCase("Timeout") ){
			return termType
		}else{
			// SessionInterval 
			if(termType.equalsIgnoreCase("SessionInterval")){
				// messageContent !== null | value=STRING | variable=[Variable]		
				val sessionInterval =  tm as SessionInterval				 
				if(sessionInterval.messageContent !== null){
					return termType+"_subTypeMsg"
				}else if(sessionInterval.value !== null){
					return termType+"_subTypeValue"
				}
				if(sessionInterval.variable !== null){
					return termType+"_subTypeVariable"
				}
				
				return termType
			
			}//MaxNumberOfOperation
			else if(termType.equalsIgnoreCase("MaxNumberOfOperation")){
				val maxNumberOfOperation =  tm as MaxNumberOfOperation	
				
				//MaxNumberOfOperationByTime
				if(maxNumberOfOperation.timeUnit !== null){
					return termType+"_subTypeTimeUnit"
				}
				// MaxNumberOfOperation
				return termType
				
				
			} // MessageContent	
			else if(termType.equalsIgnoreCase("MessageContent")){
				
				//'MessageContent' '(' (content=STRING | variable=[Variable]) (comparisonOperator=ComparisonOperator expression=Expression ('per' timeUnit=TimeUnit)?)?  ')' 
				val messageContent =  tm as MessageContent	
				
				if(messageContent.variable !== null){
					
				}
				// messageContent composed with only an xpath or a variable	
				if(messageContent.expression === null){
					// MessageContent_onlyXPath_Boolean
					if( messageContent.content.contains("==") || messageContent.content.contains("!=") ||
						messageContent.content.contains("<")  || messageContent.content.contains("<=") ||
						messageContent.content.contains(">=") || messageContent.content.contains(">")){
						return termType+"_onlyXPath_Bollean"
					// MessageContent_onlyXPath_String
					}else if(messageContent.content.contains("text()")){
						return termType+"_onlyXPath_String"
					// MessageContent_onlyXPath_Number
					
					}else{
						return termType+"_onlyXPath_Number"//	
					}		
					
				// messageContent composed with xpath/variable and comparison with a expression					
				}else if (messageContent.timeUnit === null){
					val content = messageContent.expression.toString			
					if (content.isNumeric ) {
						return termType+"_Number"//  MessageContent_Number
					}else{
						return termType+"_String"// MessageContent_String
					}
			
				// messageContent composed with xpath/variable and comparison with a expression						
				}else {
					// MessageContent_Number_PerTime					
					return termType+"_Number_PerTime"
				}						
			}
		}		
	}
	
	
	def static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str)
            return true
        } catch (NumberFormatException e) {
            try {
                Double.parseDouble(str)
                return true
            } catch (NumberFormatException e1) {
                return false
            }
        }
    }

//	def static String subTypeTer(Term tm){
//		val subTypeTermName=""
//		
//		// MessageContent
//		// SessionInterval | WeekDaysInterval | TimeInterval | Timeout | MaxNumberOfOperation | MessageContent
//		return subTypeTermName
//		
//	}
}
//				Party «ct.application.name»;
//				Party «ct.process.name»;
//				«getTerms(ct.clauses.get(0).terms)»
//				
//				
//				event «ct.clauses.get(0).name+"event"»(string _logMessage);
//				
//				constructor(address _applicationWallet, address _processWallet){
//			    	«ct.application.name» = Party("«ct.process.name» ", _applicationWallet);
//				    «ct.process.name» = Party("«ct.process.name»", _processWallet);
//				}
//				
//				function «ct.clauses.get(0).name»(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
//								
//					
//					bool isBreached=false;
//					
//					if(«getConditionals(ct.clauses.get(0).terms)») {
//						operationLimit.requestsPerformed+=1;
//			        	return true;	
//					}
//					
//					emit «ct.clauses.get(0).name+"event"» ("Request made outside of allowed hours or distance limit exceeded");
//					return false;
//				}
//			}
//		'''
//	}
//
//	def getTS(String date){
//		return (Timestamp.valueOf(date).getTime()/1000);
//	}
//	
//	def getTerms(Terms term){
//		'''
//			«FOR c: term.eAllContents.toIterable»
//				«IF(c instanceof Timeout)»
//					Timeout public timeout = Timeout(«c.seconds», 0);
//				«ELSEIF(c instanceof WeekDaysInterval)»
//					WeekDaysInterval public weekDaysInterval = WeekDaysInterval(«c.start», «c.end»);
//				«ELSEIF(c instanceof TimeInterval)»
//					TimeInterval public timeInterval = TimeInterval(«c.start», «c.end»);
//				«ELSEIF(c instanceof MaxNumberOfOperation)»
//					MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(«c.operationsNumber», «c.timeUnit», 0, 0);
//				«ELSEIF(c instanceof MessageContent)»
//					MessageContent public messageContent = MessageContent("«c.content»");
//				«ENDIF»
//			«ENDFOR»
//		'''
//	}
//	
//	def getConditionals(Terms terms){
//		'''	
//		«FOR c: terms.eAllContents.toIterable»
//			«IF(c instanceof Timeout)»
//				!isTimeout(_accessDateTime, timeout.endTime) &&
//			«ELSEIF(c instanceof WeekDaysInterval)»
//				isBusinessDay(_accessDateTime, businessDay) &&
//			«ELSEIF(c instanceof TimeInterval)»
//				isIntoTimeInterval(_accessDateTime, timeInterval) &&
//			«ELSEIF(c instanceof MaxNumberOfOperation)»
//				!isOperationLimitReached(_accessDateTime, operationLimit) &&
//			«ENDIF»
//		«ENDFOR»
//		'''
//}
