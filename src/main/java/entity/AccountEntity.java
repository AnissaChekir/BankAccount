package entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	public AccountEntity(Date date, BigDecimal credit, BigDecimal debit, BigDecimal balance) {
		super();
		this.date = date;
		this.credit = credit;
		this.debit = debit;
		this.balance = balance;
	}
	public AccountEntity() {
		super();
	}
	


}
