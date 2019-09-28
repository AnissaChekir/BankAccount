package org.bankAccount.exception;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

public class VerifAmountException extends Exception {
	
	 private static Logger logger = Logger.getLogger(VerifAmountException.class.getName());
	public VerifAmountException(BigDecimal balance) {
		logger.error("\r\n" + 
				"your balance is insufficient, you have "+ balance);
		
	}

}
