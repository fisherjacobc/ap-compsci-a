//� A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner;

/**
 * @author Jacob Fisher
 * @created 13 Mar 2025
 */
public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);

   		String choice="";

		do {
			System.out.print("\nEnter a word :: ");
			String word = keyboard.next();
			
			TriangleWord.printTriangle(word);

			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		} while (choice.toLowerCase().equals("y"));

		keyboard.close();
	}
}