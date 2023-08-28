package com.basics;
import java.util.Scanner;

public class AreaOfCylender {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter radius");
	    double radius=sc.nextDouble();
	    System.out.println("Enter height");
	    double height=sc.nextDouble();
	    
	    double surfaceArea=2*Math.PI*radius*(radius+height);
	    double volume=Math.PI*radius*radius*height;
	    
	    System.out.println("Sutrface area of cylender:"+surfaceArea);
	    System.out.println("Volume of the cylender"+volume);
	}
	

}
