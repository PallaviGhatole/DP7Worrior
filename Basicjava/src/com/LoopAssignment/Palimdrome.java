package com.LoopAssignment;

import java.util.Scanner;

public class Palimdrome {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");               
		int n1=sc.nextInt();
		
		int enternumber =n1;
		int reversenumber=0;
		
		for(int n=n1; n>0; n/=10)
		{
			reversenumber=reversenumber *10 + n%10;
		}
		
		if(n1==reversenumber)
		{
			System.out.println(enternumber+"is palindrome no");
		}
		else
		{
			System.out.println(enternumber+"is not palindrome");
		}
	}
	

}
