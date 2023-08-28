package com.khalijamamcode;

import java.util.Scanner;

public class Factor {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER");
		int num=sc.nextInt();
		
		
		
		System.out.println("ENTER FACTOR");
		int factor=sc.nextInt();
		
		if(num%factor==0)
		{
			
		System.out.println("THIS IS FACTOR OF :"+num);
	    }
		else
		{
		System.out.println("NOT A FACTOR :");
		}
		}
	
}

