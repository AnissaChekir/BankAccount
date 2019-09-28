package org.bankAccount.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bankAccount.Entity.AccountEntity;

public interface AccountService {
	
	public void deposit(BigDecimal value, Date date);
	public void withdrawal(BigDecimal value, Date date);
	public void print();
}
