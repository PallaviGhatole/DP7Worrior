package com.basics;
import java.util.Scanner;
public class Speed {

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println( "Enter The Distance");
	double distance=sc.nextDouble();
	
	System.out.println( "Enter The time");
	double time=sc.nextDouble();
	
	double speed=distance/time;
	System.out.println( "Speed is :"+speed);
	}
	
}
