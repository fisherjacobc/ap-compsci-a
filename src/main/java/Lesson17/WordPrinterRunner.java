//� A+ Computer Science  -  www.apluscompsci.com
import java.util.Scanner;
import static java.lang.System.*;

/**
 * @author Jacob Fisher
 * @created 13 Mar 2025
 */
public class WordPrinterRunner
{
	public static void main( String args[] )
	{
   		Scanner keyboard = new Scanner(System.in);

   		String choice="";

		do {
			out.print("\nEnter the word to display :: ");
			String word = keyboard.next();
	
			out.print("Enter the times to display :: ");
 			int times = keyboard.nextInt();			
			
			WordPrinter.printWord(word, times);

			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		} while (choice.toLowerCase().equals("y"));

		keyboard.close();
	}
}