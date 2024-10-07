//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Scanner;

/**
 * @author Jacob Fisher
 * @created 07 Oct 2024
 */
public class DecoderRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		Decoder decoder = new Decoder();

		System.out.print("Enter a character :: ");
		char c = keyboard.next().charAt(0);
		System.out.println(decoder.deCode(c));

		keyboard.close();
	}
}