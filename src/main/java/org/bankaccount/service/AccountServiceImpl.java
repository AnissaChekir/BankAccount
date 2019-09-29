package org.bankaccount.service;

import static org.bankaccount.converter.DateConverter.convertDateToString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.bankaccount.Entity.AccountEntity;
import org.bankaccount.exception.NegativeAmountException;
import org.bankaccount.exception.VerifAmountException;


public class AccountServiceImpl implements AccountService {
	private BigDecimal balance=BigDecimal.ZERO; 
	
	
	private  List<AccountEntity> listTransaction = new ArrayList<>();

	public void deposit(BigDecimal value, Date date) throws NegativeAmountException {
		if(value.intValue()<=0) {
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
			
			List<AccountEntity> sortedTransactionList = listTransaction.stream().
					sorted((AccountEntity t1, AccountEntity t2)->t1.getDate().compareTo(t2.getDate())).collect(Collectors.toList());
			System.out.println("date      || credit   || debit  || balance");
			sortedTransactionList.forEach(account -> {
				if(account.getCredit()==null) {
					System.out.println(convertDateToString(account.getDate())+"||"+"     "+"     ||    "+ account.getDebit()+" ||    "+account.getBalance());
				}else if(account.getDebit()==null) {
					System.out.println(convertDateToString(account.getDate())+"||"+ account.getCredit()+"      ||    "+"    "+"||    "+account.getBalance());
				}
				
			});
		
	}
	

}




