package org.bankAccount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bankAccount.Entity.AccountEntity;

public abstract class Operation {

	private  List<AccountEntity> listTransection = new ArrayList<AccountEntity>();
	
	public abstract void Transaction(BigDecimal amount, Date date);

	public void addTransaction(BigDecimal amount, Date date, BigDecimal balance ) {
		AccountEntity transaction = new AccountEntity(date, amount, null, balance);
		listTransection.add(transaction);
		
	}
	
	public List<AccountEntity> getListTransection() {
		return listTransection;
	}

	public void setListTransection(List<AccountEntity> listTransection) {
		this.listTransection = listTransection;
	}
	
	
}
