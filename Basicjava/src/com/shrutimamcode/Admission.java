package com.shrutimamcode;

import java.util.Scanner;

public class Admission {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total percentage");
		double per=sc.nextDouble();
		
		System.out.println("Enter pcm group marks");
		double pcm=sc.nextDouble();
		
		
		if((per>=90) || (pcm>=85))
		{
			System.out.println("Admission confirm........");
			
		}
		else
		{
			System.out.println("Sorry Admission cancel........");
		}
	}

}
