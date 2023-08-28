package com.LoopAssignment;

import java.util.Scanner;

public class CountDigit {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int count=0;
		
		if(n==0)
		{
			count=1;
		}
		else
		{
		for(int n1=n;n1!=0;n1/=10)
		{
			count++;
		}
	}
			
			
			System.out.println("NUMBER OF DIGIT IS :"+count);
		
	
}
}
			
		


