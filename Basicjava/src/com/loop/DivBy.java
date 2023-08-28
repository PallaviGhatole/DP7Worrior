package com.loop;
import java.util.Scanner;
public class DivBy {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=50;i++)
		{
			
			if(i%3==0 && i%5==0)
			{
				System.out.println(" Bye....");
				
			}
			else if(i%3==0)
			{
				System.out.println(" WELCOME....");
			}
			else if(i%5==0)
			{
				System.out.println("HELLO....");
			}
			else
			{
				System.out.println(i);
			}
		}
	}

}
