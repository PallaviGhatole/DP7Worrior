package com.basics;
import java.util.Scanner;
public class Alphabet {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char character=sc.next().charAt(0);
		
		if(character>='a' && character<='z' || character>='A' && character<='Z')
		{
			System.out.println(" It is ALPHABET");
					
			
		}
		else if(character>='0' && character<='9')
			
			System.out.println(" It is DIGIT");
	else  
	{
		System.out.println(" It is SPECIAL CHARACTER");
	}

}
}

