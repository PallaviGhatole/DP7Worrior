package com.khalijamamcode;

import java.util.Scanner;

public class SwitchOperation {
	public static void main(String args[])
	{
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter which operation");
	char operation=sc.next().charAt(0);
	
	System.out.println("Enter the num1");
    int num1=sc.nextInt();
	
	System.out.println("Enter the num2");
	int num2=sc.nextInt();
	
	switch(operation)
	{
	
	
	case '+': System.out.println("Addition is :"+(num1+num2));
	break;
	
	case '-': System.out.println("Substraction is :"+(num1-num2));
	break;
	
	case '*': System.out.println("Multiplication is :"+num1*num2);
	break;
	
	case '/': System.out.println("Division is :"+num1/num2);
	break;
	
	case '%': System.out.println("Modulus is :"+num1%num2);
	break;
	

	
	}
	
	}
}



