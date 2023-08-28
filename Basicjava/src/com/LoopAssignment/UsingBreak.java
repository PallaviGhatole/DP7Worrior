package com.LoopAssignment;
import java.util.Scanner;
public class UsingBreak {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("TURN BUTTON WHICH YOU WANT TO ON 1.LIGHT 2.FAN 3.TV");
		int button=sc.nextInt();
		
		switch(button)
		{
		case 1: System.out.println("LIGHT IS ON");
		break;
		
		case 2: System.out.println("FAN IS ON");
		break;
		
		case 3: System.out.println("TV IS ON");
		break;
		
		default :System.out.println("YOU TURN WRONG BUTTON");
	
		
		}
	}

}
