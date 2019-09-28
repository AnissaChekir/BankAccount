package org.bankAccount;

import java.math.BigDecimal;
import java.util.Date;

import org.bankAccount.Entity.AccountEntity;

public class withdrawal extends Operation {
	
	AccountEntity accountEntity;
	
	
	public withdrawal(AccountEntity accountEntity) {
		super();
		this.accountEntity = accountEntity;
	}


	@Override
	public void Transaction(BigDecimal amount, Date date) {
		if(accountEntity.getBalance().compareTo(amount)<0 )
		{
			throw new ArithmeticException("vous n'avez pas de solde");
		}else {
			
			accountEntity.setBalance(accountEntity.getBalance());
	
			addTransaction(amount, date, accountEntity.getBalance());
		}
		
	}

}
