package BankAccount.BankAccount;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
	private int balance=0; 
	
	 List<Transaction> listTransection = new ArrayList<Transaction>();
	public void deposit(int value, Date date) {
		Transaction transaction = new Transaction();
		this.balance += value; 
		transaction.setCredit(value);
		transaction.setBalance(balance);
		transaction.setDate(date);
		listTransection.add(transaction);
	}
	
	public void withdrawal(int value, Date date) {
		if(balance < value)
		{
			throw new ArithmeticException("vous n'avez pas de solde");
		}else {
			Transaction transaction = new Transaction();
			this.balance -= value;
			transaction.setDebit(value);
			transaction.setBalance(balance);
			transaction.setDate(date);
			listTransection.add(transaction);
		}
		
	}

	public List<Transaction> getListTransection() {
		return listTransection;
	}

	public void setListTransection(List<Transaction> listTransection) {
		this.listTransection = listTransection;
	}

}
