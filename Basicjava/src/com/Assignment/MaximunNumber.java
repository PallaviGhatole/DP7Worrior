package com.Assignment;
import java.util.Scanner;

public class MaximunNumber {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE num1");
		int num1=sc.nextInt();
		
		System.out.println("ENTER THE NUM2");
		int num2=sc.nextInt();
		
		System.out.println("ENTER THE NUM3");
		int num3=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("num1 is maximum");
			
		}
		else if(num2>num3)
		{
			System.out.println("num2 is maximum");
		}
		else if(num3>num1)
		{
			System.out.println("num3 is maximum");
		}
		
		
		
		
	}

}
