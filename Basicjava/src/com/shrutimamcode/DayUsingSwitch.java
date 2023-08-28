package com.shrutimamcode;
import java.util.Scanner;
public class DayUsingSwitch {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the weekday 1 to 7");
		int weekday=sc.nextInt();
		
		switch(weekday)
		
		{
		case 1: System.out.println("MONDAY");
		break;
		      
		case 2: System.out.println("TUESDAY");
	    break;
	    
		case 3: System.out.println("WEDESDAY");
	    break;
	    
		case 4: System.out.println("THUSDAY");
	    break;
	    
		case 5: System.out.println("FRIDAY");
		break;
		
		case 6: System.out.println("SATURDAY");
		
		break;
		
		case 7:System.out.println("SATURDAY");
		break;
		
		
		default :System.out.println("ERROR THIS IS NOT WEEK DAY......");
		
		}
		
		
	}

}
