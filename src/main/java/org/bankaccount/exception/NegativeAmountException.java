package org.bankaccount.exception;

import org.apache.log4j.Logger;

public class NegativeAmountException extends Exception {

	 private static final Logger logger = Logger.getLogger(VerifAmountException.class);
	public NegativeAmountException() {
		logger.error("you can not deposit a negative amount");
	}
}
