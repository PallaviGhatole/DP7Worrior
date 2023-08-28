package com.khalijamamcode;
import java.util.Scanner;
public class BloodDonate {
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR AGE");
		int age=sc.nextInt();
		
		System.out.println("ENTER YOUR WEIGHT");
		float weight=sc.nextFloat();
		
		if(age>18)
		{
			if(weight>=70)
				{
				System.out.println("Eligible to donate blood.....");
				}
			else 
			{
				System.out.println("YOU ARE UNDERWEIGHT");
			}
		}
			else
			{
				System.out.println("YOUR WEIGHT IS NOT MATCH");
				}
	}

}
