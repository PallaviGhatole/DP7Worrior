package com.shrutimamcode;
import java.util.Scanner;
public class College {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the per");
		
		float per=sc.nextFloat();
		
		if(per>65)
		{
			System.out.println("Eligible for college......");
			if(per>=80)
			{
				System.out.println("Can option science and commerse stream");
				
			}
			else 
			{
				System.out.println("Can option commerse stream");
				
		}
	}
		else 
		{
			System.out.println("Note eligible for college");
		}
}
}
