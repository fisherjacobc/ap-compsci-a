//(c) A+ Computer Science
//www.apluscompsci.com

//input worksheet key

import static java.lang.System.*;  
import java.util.Scanner;

public class InputWorkSheetKEY
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int intOne=0;
		double doubleOne=0;
		short shortOne=0;
		byte byteOne=0;
		
		
		out.print("Enter an integer :: ");
		
		intOne = keyboard.nextInt();
		
		out.print("Enter a double :: ");
		
		doubleOne = keyboard.nextDouble();
		
		out.print("Enter a short :: ");
		
		shortOne = keyboard.nextShort();
		
		out.print("Enter a byte :: ");
		
		byteOne = keyboard.nextByte();


	}
}