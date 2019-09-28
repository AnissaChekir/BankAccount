package org.bankAccount.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bankAccount.Entity.AccountEntity;
import org.bankAccount.exception.NegativeAmountException;
import org.bankAccount.exception.VerifAmountException;

public interface AccountService {
	
	public void deposit(BigDecimal value, Date date) throws NegativeAmountException;
	public void withdrawal(BigDecimal value, Date date) throws VerifAmountException;
	public void print();
}
