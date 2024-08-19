//(c) A+ Computer Science
//www.apluscompsci.com

//scanner input examples

import java.util.Scanner;

public class Input_examples
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter an int (-2billion to 2billion):: ");
		int intOne = keyboard.nextInt();
		System.out.println(intOne);
		
		System.out.print("Enter a double :: ");
		double dec = keyboard.nextDouble();
		System.out.println(dec);			
		
		System.out.print("Enter a float :: ");
		float flote = keyboard.nextFloat();
		System.out.println(flote);
		
		System.out.print("Enter a short (-32768 to 32767) :: ");
		short shortOne = keyboard.nextShort();
		System.out.println(shortOne);	
	}
}