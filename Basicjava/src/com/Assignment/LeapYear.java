package com.Assignment;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A YEAR");
		int year=sc.nextInt();
		
		if(year%4==0 && year%100!=0)
		{
			System.out.println(" IT IS LEAP YEAR.....!!");
			
		}
		else if(year%100==0 && year%400==0)
		{
			System.out.println("IT IS LEAP YEAR.....!!");
		}
		else
		{
			System.out.println("IT IS NOT LEAP YEAR.....!!");
		}
			  
	}

}
