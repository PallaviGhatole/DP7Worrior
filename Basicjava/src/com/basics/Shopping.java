package com.basics;
import java.util.Scanner;
public class Shopping {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of chocalate bought");
		int chocalate=sc.nextInt();
		
		System.out.println("Shopping Bill");
		System.out.println("Total Bill :"+((chocalate*100)));
		
		
	}

}
