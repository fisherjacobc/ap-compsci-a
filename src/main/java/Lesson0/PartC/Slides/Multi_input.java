//(c) A+ Computer Science
//www.apluscompsci.com

//scanner mutiple input example

import java.util.Scanner;

public class Multi_input
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter 10 ints with spaces in between :: ");

		System.out.println(keyboard.nextInt());
		System.out.println(keyboard.nextInt());
		System.out.println(keyboard.nextInt());
				
		System.out.println( keyboard.nextInt() +  keyboard.nextInt() );

		int sum = keyboard.nextInt();
		sum = sum + keyboard.nextInt();
		sum = sum + keyboard.nextInt();
		System.out.println( sum );
	}
}
