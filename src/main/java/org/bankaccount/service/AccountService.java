package org.bankaccount.service;

import java.math.BigDecimal;
import java.util.Date;

import org.bankaccount.exception.NegativeAmountException;
import org.bankaccount.exception.VerifAmountException;

public interface AccountService {
	
	public void deposit(BigDecimal value, Date date) throws NegativeAmountException;
	public void withdrawal(BigDecimal value, Date date) throws VerifAmountException;
	public void print();
}
