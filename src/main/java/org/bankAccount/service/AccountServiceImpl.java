package org.bankAccount.service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.bankAccount.Entity.AccountEntity;
import org.bankAccount.exception.NegativeAmountException;
import org.bankAccount.exception.VerifAmountException;


public class AccountServiceImpl implements AccountService {
	private BigDecimal balance=BigDecimal.ZERO; 
	
	
	private  List<AccountEntity> listTransaction = new ArrayList<AccountEntity>();

	public void deposit(BigDecimal value, Date date) throws NegativeAmountException {
		if(value.intValue()<0) {
			throw new NegativeAmountException();
		}
		this.balance = balance.add(value) ; 
		AccountEntity transaction = new AccountEntity(date,value,null,balance);
		listTransaction.add(transaction);
	}

	public void withdrawal(BigDecimal value, Date date) throws VerifAmountException {
		
			if(balance.compareTo(value)<0 )
			{
				throw new VerifAmountException(balance);
			}else {
				this.balance = balance.subtract(value);
				AccountEntity transaction = new AccountEntity(date,null,value,balance);
				listTransaction.add(transaction);
			}
		
	}

	public void print() {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			
			
			List<AccountEntity> sortedList = listTransaction.stream().
					sorted((AccountEntity t1, AccountEntity t2)->t1.getDate().compareTo(t2.getDate())).collect(Collectors.toList());
			System.out.println("date       | credit   | debit | balance");
			sortedList.forEach(test -> System.out.println(formatter.format(test.getDate())+"||"+ test.getCredit()+"      ||    "+ test.getDebit()+"||    "+test.getBalance()));
		
	}
	

}




