package com.LoopAssignment;
import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter Base");
	    int base=sc.nextInt();
	    
	    System.out.println("Enter index");
	    int index=sc.nextInt();
	    
	    
	    int n;
	    int power=1;
	    
	    for(int i=0;i<index;i++)
	    {
	   
	    power*=base;
	   
	    
	}
	
	    System.out.println("THE POWER IS :"+power);
		
	}
}
