package com.SwitchAssignment;
import java.util.Scanner;

public class StringSwitch {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Name");
		String name=sc.next();
		
		switch(name)
		{
		case "Pallavi" :
			System.out.println("She is so cute !!!!!");
			break;
			
		case "Sejal" :
			System.out.println("She is so preety !!!!!");
			break;
			
		case "kalyani" :
			System.out.println("She is so Beutiful !!!!!");
			break;
		}
		
		
		
		
	}

}
