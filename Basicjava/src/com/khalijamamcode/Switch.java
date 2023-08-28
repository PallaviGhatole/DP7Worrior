package com.khalijamamcode;

import java.util.Scanner;
public class Switch {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER OPERATION");
		char operation=sc.next().charAt(0);
		
		
		switch(operation)
		{
		case '+' : System.out.println("ADDITON");
		break;
		
		case '-' : System.out.println("SUBSTRACTION");
		break;
		
		case '*' : System.out.println("MULTIPLICATION");
		break;
		
		case '/' : System.out.println("DIVISION");
		break;
		
		default: System.out.println("ENTER VALID OPERATION");
		
		}
	}

}
