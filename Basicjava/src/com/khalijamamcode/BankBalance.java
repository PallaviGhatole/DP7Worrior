package com.khalijamamcode;
import java.util.Scanner;
public class BankBalance {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int balance=50000;
		
		System.out.println("WELCOME TO HDFC BANK....!!!!");
		System.out.println("ENTER THE PIN");
		int pin=sc.nextInt();
		
		
		if(pin==4455)
		{
			System.out.println("1. Deposite");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
		
	
	        System.out.println("ENTER CHOICE");
	        int choice=sc.nextInt();
	        
	        
	        if(choice==1)
	        {
	        	System.out.println("ENTER AMOUNT TO DEPOSITE");
	        	int deposite=sc.nextInt();
	        	balance=balance+deposite;
	        	System.out.println("AVAILABLE BALANCE IS :"+balance);
	        }
	        
	        
	        if(choice==2)
	        {
	        	System.out.println("ENTER AMOUNT TO WINTHDRAW");
	        	int withdraw=sc.nextInt();
	        	balance=balance-withdraw;
	        	System.out.println("AVAILABLE BALANCE IS :"+balance);
	        }
	        else
	        {
	        	System.out.println("Plzzz TYPE CORRECT PASSWORD.....");
	        }
	

}
	}
}
