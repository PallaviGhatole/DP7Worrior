package com.basics;
import java.util.Scanner;
public class Student {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println(" Enter the sub1");
		int sub1=sc.nextInt();
		System.out.println(" Enter the sub2");
		int sub2=sc.nextInt();
		System.out.println(" Enter the sub3");
		int sub3=sc.nextInt();
		
		double
		percentage=(sub1+sub2+sub3)/300.0*100;
		System.out.println(" Student Percentage is :"+percentage);
		
		
		
		
		
		
	}

}
