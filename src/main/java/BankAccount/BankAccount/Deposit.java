package BankAccount.BankAccount;

import java.math.BigDecimal;
import java.util.Date;

import entity.AccountEntity;

public class Deposit extends Operation {
	
	AccountEntity accountEntity;
	public Deposit(AccountEntity accountEntity) {
		super();
		this.accountEntity = accountEntity;
	}
	@Override
	public void Transaction(BigDecimal amount, Date date) {
		accountEntity.setBalance(accountEntity.getBalance().add(amount));
		//this.balance = balance.add(amount) ;
		addTransaction(amount, date, accountEntity.getBalance());
		
		
	}

	
	

}
