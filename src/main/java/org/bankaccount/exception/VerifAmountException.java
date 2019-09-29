package org.bankaccount.exception;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

public class VerifAmountException extends Exception {
	
	 private static final Logger logger = Logger.getLogger(VerifAmountException.class);
	public VerifAmountException(BigDecimal balance) {
		logger.error("\r\n" + 
				"your balance is insufficient, you have "+ balance);
		
	}

}
