//(c) A+ Computer Science
//www.apluscompsci.com

import static java.lang.System.*;
import java.util.Scanner;

/**
 * @author Jacob Fisher
 * @created 20 Sep 2024
 */
public class StringRunner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		out.print("Enter a word :: ");
		String word = keyboard.next();
		StringStuff s = new StringStuff(word);
		System.out.println("has even length " + s.isEvenLength());
		System.out.println("has same first last letters " + s.sameFirstLastLetters());
		System.out.println("ends with cat " + s.endsWith("cat"));

		out.print("Enter a word :: ");
		word = keyboard.next();
		s.setString(word);
		System.out.println("has even length " + s.isEvenLength());
		System.out.println("has same first last letters " + s.sameFirstLastLetters());
		System.out.println("ends with it " + s.endsWith("it"));

		keyboard.close();
	}
}