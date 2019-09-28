package org.bankAccount.exception;

import org.apache.log4j.Logger;

public class NegativeAmountException extends Exception {

	 private static Logger logger = Logger.getLogger(VerifAmountException.class.getName());
	public NegativeAmountException() {
		logger.info("you can not deposit a negative amount");
	}
}
