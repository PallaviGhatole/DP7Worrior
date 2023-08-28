package com.conditionalstatement;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		
		
		if(num%2==0)
		{
			System.out.println("NUMBER IS EVEN....");
			
		}
		else
		{
			System.out.println("NUMBER IS ODD....");
		}
		
		
	}
}
