package com.Assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the choice (+,-,*,/,%)");
		char choice=sc.next().charAt(0);
		
		System.out.println("Enter the num1");
	    double num1=sc.nextDouble();
		
		System.out.println("Enter the num2");
		double num2=sc.nextDouble();
		
		double result;
		
		if(choice=='+')
		{
	       result=(num1+num2);
		   {
		   System.out.println("Addition is :"+result);
		   }
		}
		
		    else if(choice=='-')
		    {
			result=num1-num2;
		    {
			System.out.println("substraction is :"+result);
			}
		    }
		    
		    else if(choice=='*')
		    {
			 
			result=num1*num2;	
		    {	
		    System.out.println("Multiplication is :"+result);
			}
		    }
		    else if(choice=='/')
		    {
		    result=num1/num2;
		    {
		    System.out.println("Division is :"+result);
			
		    }
		    }
		    else if(choice=='%')
		    {
		    result=(num1%num2);
		    {
		    System.out.println("Modulus is :"+result);
		    }
	}
}
}
