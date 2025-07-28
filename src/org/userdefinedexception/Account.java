package org.userdefinedexception;
import java.util.*;
public class Account {
	double balance=1000;
	
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		try {
			
		if(balance<amount)
		{
			throw new InsufficientFundException("your balance is "+balance);
		}
		else {
			balance=balance-amount;
			System.out.println(amount+" is withdrawed current balance is "+balance);
		}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		

	}
	public static void main(String[] args) {
		Account account=new Account();
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter amount to withdraw");
			double amount=scanner.nextDouble();
			account.withdraw(amount);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
