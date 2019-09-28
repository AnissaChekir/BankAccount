package org.bankAccount;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.bankAccount.service.AccountService;
import org.bankAccount.service.AccountServiceImpl;


public class App 
{
	  static Operation operation;
	  
	  
	 
    public static void main( String[] args ) throws ParseException
    {
    	 AccountService account = new AccountServiceImpl();
     
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		
		account.deposit(new BigDecimal("1000.000"), formatter.parse("10/01/2012"));
		account.deposit(new BigDecimal("2000"), formatter.parse("13/01/2012"));
		account.withdrawal(new BigDecimal("500"), formatter.parse("14/01/2012"));
		account.print();
		
       /*AccountEntity accountEntity = new AccountEntity();
       accountEntity.setBalance(BigDecimal.ZERO);
       
		Operation op1 = new Deposit(accountEntity);
		Operation op2 = new withdrawal(accountEntity);
		op1.Transaction(new BigDecimal("1000.000"), formatter.parse("10/01/2012"));
		
		op2.Transaction(new BigDecimal("500"), formatter.parse("14/01/2012"));
		List<AccountEntity> sortedList = operation.getListTransection().stream().
				sorted((AccountEntity t1, AccountEntity t2)->t1.getDate().compareTo(t2.getDate())).collect(Collectors.toList());
		System.out.println("date       | credit   | debit | balance");
		sortedList.forEach(test -> System.out.println(formatter.format(test.getDate())+"||"+ test.getCredit()+"      ||    "+ test.getDebit()+"||    "+test.getBalance()));
		*/
       
    }
}
