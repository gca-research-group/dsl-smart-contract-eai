//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract sendMessageWhatsapp is EAI_Domain{
	
	Party whatsapp;
	Party integrationProcess;
	
	BusinessDay public businessDay = BusinessDay(MONDAY, FRIDAY);
	OperationLimit public operationLimit = OperationLimit(10000, MONTH, 0, 0);
	
	event EventLog(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	whatsapp = Party(" ", _applicationWallet);
	    integrationProcess = Party("", _processWallet);
	}
	
	function sendMessage(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(isBusinessDay(_accessDateTime, businessDay) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit EventLog ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
