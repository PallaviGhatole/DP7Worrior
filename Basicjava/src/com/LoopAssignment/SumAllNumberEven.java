package com.LoopAssignment;

import java.util.Scanner;

public class SumAllNumberEven {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int i;
		int sum=0;
	
	
		for(i=1;i<=n;i++)
		{
			if(n%2==0)
			{
			sum=sum+i;
			}
		}
		
			System.out.println("SUM OF ALL NUMBERS FROM 1 TO N IS :"+sum);
		}
			
		

	}
	





