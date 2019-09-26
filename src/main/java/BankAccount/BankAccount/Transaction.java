package BankAccount.BankAccount;

import java.util.Date;

public class Transaction {
	
	private Date date;
	private int credit;
	private int debit;
	private int balance;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getDebit() {
		return debit;
	}
	public void setDebit(int debit) {
		this.debit = debit;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	} 
	

}
