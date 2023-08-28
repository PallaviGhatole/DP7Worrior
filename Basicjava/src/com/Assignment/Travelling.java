package com.Assignment;
import java.util.Scanner;
public class Travelling {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter airlines name");
		char name=sc.next().charAt(0);
		
		System.out.println("Enter depart place");
		char place=sc.next().charAt(0);
		System.out.println("Enter Destination place");
		char desplace=sc.next().charAt(0);
		System.out.println("Enter the coupon code if you have");
		int code=sc.nextInt();
		
		if(code==12345)
		{
			double price=30000;
			System.out.println("We are providing you 10% discount");
			double Totalprice=30000/100*10;
			
				System.out.println("Your price"+Totalprice);
				System.out.println("CONGRATILATIONS.........!!!!");
				System.out.println("ENJOY YOUR JOURNEY...........");
			}
			else
			{
				System.out.println("no such code is available");
				System.out.println("original price=30000");
			}
		
			
			
			
	}
		
}

	


