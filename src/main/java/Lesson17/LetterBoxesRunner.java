//� A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner;

/**
 * @author Jacob Fisher
 * @created 13 Mar 2025
 */
public class LetterBoxesRunner
{
	public static void main( String args[] )
	{		
		Scanner keyboard = new Scanner(System.in);

   		String choice="";

		do {
			System.out.print("\nEnter the letter for the box :: ");
			String word = keyboard.next();
	
			System.out.print("Enter the size of the box :: ");
 			int times = keyboard.nextInt();			
			
			LetterBoxes.printBox(word, times);

			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		} while (choice.toLowerCase().equals("y"));

		keyboard.close();
	}
}