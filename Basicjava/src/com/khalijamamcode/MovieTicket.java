package com.khalijamamcode;

import java.util.Scanner;

public class MovieTicket {
	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ENTER MOVIE DATE..");
	int date=sc.nextInt();
	System.out.println("ENTER MOVIE NAME..");
	char movie=sc.next().charAt(0);
	
	System.out.println("ENTER RATING");
	int rating=sc.nextInt();
	
	System.out.println("ENTER PRICE");
	float price=sc.nextFloat();
	
	System.out.println("COUPON CODE AVAILABLE");
	System.out.println("PRESS 0 FOR SILVER 1 FOR GOLD");
	int code=sc.nextInt();
	
	if(code==0)
	{
		
        
		System.out.println("YOU ARE GETTING 50 RU. OFF ");
		price=price-50;
		System.out.println("YOUE MOVIE TICKET IS BOOKED AT PRICE :"+price);
	} 
	
	
	else if(code==1)
	{
		System.out.println("YOU ARE GETTING 100 RU. OFF");
		price=price-100;
		System.out.println("YOUE MOVIE TICKET IS BOOKED AT PRICE :"+price);
	}
	else
		 System.out.println("YOU ARE GETTING ORIGINAL PRICE");
		
	
}

	
	
}


