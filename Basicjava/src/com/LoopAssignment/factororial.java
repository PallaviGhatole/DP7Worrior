package com.LoopAssignment;

import java.util.Scanner;

public class factororial {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int s=1;
		int sum=0;
		
		
		for(int i=1;i<=n;i++)
		{
			s=s*i;
		
			sum=sum+s;
		}

			System.out.println("SUM OF ALL S IS :"+s);
}
}



