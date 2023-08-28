package com.Assignment;

import java.util.Scanner;

public class DivisibleBy {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER");
		int num=sc.nextInt();
		
		if(num%5==0 && num%11==0)
		{
			System.out.println("NUMBER IS DIVISIBLE BY 5 AND 11");
			
		}
		else
			System.out.println("NUMBER IS NOT DIVISIBLE BY 5 AND 11");
	}
}
