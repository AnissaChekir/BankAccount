package BankAccount.BankAccount;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
       AccountService account = new AccountService();
       
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		
		account.deposit(new BigDecimal("1000.000"), formatter.parse("10/01/2012"));
		account.deposit(new BigDecimal("2000"), formatter.parse("13/01/2012"));
		account.withdrawal(new BigDecimal("500"), formatter.parse("14/01/2012"));
		AccountEntity t = new AccountEntity();
		List<AccountEntity> sortedList = account.getListTransection().stream().
				sorted((AccountEntity t1, AccountEntity t2)->t1.getDate().compareTo(t2.getDate())).collect(Collectors.toList());
		System.out.println("date       | credit   | debit | balance");
		sortedList.forEach(test -> System.out.println(formatter.format(test.getDate())+"||"+ test.getCredit()+"      ||    "+ test.getDebit()+"||    "+test.getBalance()));
		
		
       
    }
}
