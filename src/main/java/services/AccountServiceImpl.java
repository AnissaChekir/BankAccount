package services;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import entity.AccountEntity;


public class AccountServiceImpl implements AccountService {
	private BigDecimal balance=BigDecimal.ZERO; 
	
	private  List<AccountEntity> listTransaction = new ArrayList<AccountEntity>();

	public void deposit(BigDecimal value, Date date) {
		AccountEntity transaction = new AccountEntity();
		this.balance = balance.add(value) ; 
		transaction.setCredit(value);
		transaction.setBalance(balance);
		transaction.setDate(date);
		listTransaction.add(transaction);
	}

	public void withdrawal(BigDecimal value, Date date) {
		
			if(balance.compareTo(value)<0 )
			{
				throw new ArithmeticException("vous n'avez pas de solde");
			}else {
				AccountEntity transaction = new AccountEntity();
				this.balance = balance.subtract(value);
				transaction.setDebit(value);
				transaction.setBalance(balance);
				transaction.setDate(date);
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




