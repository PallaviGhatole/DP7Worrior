package com.khalijamamcode;

import java.util.Scanner;

public class LeapYearTernary {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		
		String leapyear;
		
		leapyear=(year%4==0)?"Leap Year":"Not Leap Year";
	}

}
