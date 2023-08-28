package com.conditionalstatement;
import java.util.Scanner;
public class Vote {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR AGE");
		int age=sc.nextInt();
		
		if(age>=18)
			
		{
			System.out.println(" YOU CAN VOTE.....");
			
		}
	
	else
	{
		System.out.println(" YOU CANNOT VOTE.......");
	}
	System.out.println("REST OF CODE......");
		

}
}
