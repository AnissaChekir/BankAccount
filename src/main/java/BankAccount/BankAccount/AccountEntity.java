package BankAccount.BankAccount;

import java.math.BigDecimal;
import java.util.Date;

public class AccountEntity {
	
	private Date date;
	private BigDecimal credit;
	private BigDecimal debit;
	private BigDecimal balance;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BigDecimal getCredit() {
		return credit;
	}
	public void setCredit(BigDecimal credit) {
		this.credit = credit;
	}
	public BigDecimal getDebit() {
		return debit;
	}
	public void setDebit(BigDecimal debit) {
		this.debit = debit;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}


}
