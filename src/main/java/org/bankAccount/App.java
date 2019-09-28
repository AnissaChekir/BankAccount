package org.bankAccount;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.log4j.BasicConfigurator;
import org.bankAccount.exception.NegativeAmountException;
import org.bankAccount.exception.VerifAmountException;
import org.bankAccount.service.AccountService;
import org.bankAccount.service.AccountServiceImpl;

public class App 
{
	  
	  
	 
    public static void main( String[] args ) throws ParseException, VerifAmountException, NegativeAmountException
    {
    	BasicConfigurator.configure();
    	 AccountService account = new AccountServiceImpl();
     
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		
		account.deposit(new BigDecimal("1000"), formatter.parse("10/01/2012"));
		account.deposit(new BigDecimal("2000"), formatter.parse("13/01/2012"));
		account.withdrawal(new BigDecimal("500"), formatter.parse("14/01/2012"));
		account.print();
	
       
    }
}
