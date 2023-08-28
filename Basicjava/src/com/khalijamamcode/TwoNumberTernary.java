package com.khalijamamcode;

import java.util.Scanner;

public class TwoNumberTernary {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the number1");
		int num1=sc.nextInt();
		
		System.out.println("Enter the number2");
		int num2=sc.nextInt();
		
		System.out.println("Enter the number3");
		int num3=sc.nextInt();
		
	    String greater;
		
		greater=(num1>num2)?(num1>num3)?"num1":"num2":num2>num3?"num2":"num3";
		System.out.println(greater+ "  is Greater Number");
	}

}
