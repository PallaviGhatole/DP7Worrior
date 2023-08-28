package com.conditionalstatement;

import java.util.Scanner;

public class PallaviScore {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		char name=sc.next().charAt(0);
		
		
		
		System.out.println("Enter Sub1 Marks");
		int sub1=sc.nextInt();
		System.out.println("Enter Sub2 Marks");
		int sub2=sc.nextInt();
		System.out.println("Enter Sub3 Marks");
		int sub3=sc.nextInt();
		System.out.println("Enter Sub4 Marks");
		int sub4=sc.nextInt();
		System.out.println("Enter Sub5 Marks");
		int sub5=sc.nextInt();
		
		
		float total=(sub1+sub2+sub3+sub4+sub5);
		float percentage=(total/500)*100;
		
		if(percentage>70)
		{
			
			System.out.println("CONGRATULATIONS !! PASSED AND PROMPTED");
			
		}
		else if(percentage<70)
		{
			System.out.println("YOU HAVE FAILED!! TRY HARD NEXT TIME");
		}
				
			
	}

}
