package BankAccount.BankAccount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountService {
	private BigDecimal balance=BigDecimal.ZERO; 
	
	private  List<AccountEntity> listTransection = new ArrayList<AccountEntity>();
	public void deposit(BigDecimal value, Date date) {
		AccountEntity transaction = new AccountEntity();
		this.balance = balance.add(value) ; 
		transaction.setCredit(value);
		transaction.setBalance(balance);
		transaction.setDate(date);
		listTransection.add(transaction);
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
			listTransection.add(transaction);
		}
		
	}

	public List<AccountEntity> getListTransection() {
		return listTransection;
	}

	public void setListTransection(List<AccountEntity> listTransection) {
		this.listTransection = listTransection;
	}

}
