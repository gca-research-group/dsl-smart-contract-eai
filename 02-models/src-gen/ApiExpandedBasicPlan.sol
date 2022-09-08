//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract ApiExpandedBasicPlan is EAI_Domain{
	
	Party webOfScience;
	Party integrationProcess;
	
	OperationLimit public operationLimit = OperationLimit(2, SECOND, 0, 0);
	MessageContent public messageContent = MessageContent("count(//body/document)");
	MessageContent public messageContent = MessageContent("count(//body/document)");
	
	event EventLog(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	webOfScience = Party(" ", _applicationWallet);
	    integrationProcess = Party("", _processWallet);
	}
	
	function requestDocuments(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(!isOperationLimitReached(_accessDateTime, operationLimit) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit EventLog ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
