//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Scanner;

/**
 * @author Jacob Fisher
 * @created 16 Sep 2024
 */
public class StringRunner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a word :: ");
		String word = keyboard.next();

		StringStuff s = new StringStuff(word);
		System.out.println("has first last letters :: " + s.getFirstLastLetters());
		System.out.println("has middle letter :: " + s.getMiddleLetter());
		System.out.println("has same first and last letter :: " + s.sameFirstLastLetters());

		keyboard.close();
	}
}