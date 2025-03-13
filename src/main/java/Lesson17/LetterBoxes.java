//� A+ Computer Science  -  www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 13 Mar 2025
 */
public class LetterBoxes
{
	//instance variables and constructors could be present, but are not necessary
	
	public static void printBox(String letter, int size)
	{
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
				System.out.print(letter);
			System.out.println();
		}
	}
}