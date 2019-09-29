package org.bankaccount;

import static org.bankaccount.converter.DateConverter.convertToDate;

import java.math.BigDecimal;
import java.text.ParseException;

import org.apache.log4j.BasicConfigurator;
import org.bankaccount.exception.NegativeAmountException;
import org.bankaccount.exception.VerifAmountException;
import org.bankaccount.service.AccountService;
import org.bankaccount.service.AccountServiceImpl;

public class App 
{
	  
	  
	 
    public static void main( String[] args ) throws ParseException, VerifAmountException, NegativeAmountException
    {
    	BasicConfigurator.configure();
    	 AccountService account = new AccountServiceImpl();
		
		account.deposit(new BigDecimal("1000"), convertToDate("10/01/2012"));
		account.deposit(new BigDecimal("2000"), convertToDate("13/01/2012"));
		account.withdrawal(new BigDecimal("500"), convertToDate("14/01/2012"));
		account.print();
	
       
    }
}
