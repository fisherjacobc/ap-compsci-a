//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 7 Nov 2024
 */
public class TriangleOne {
	public static void print(String word) {
		for (int i = word.length() - 1; i > 0; i--) {
			System.out.println(word.substring(0, i + 1));
		}
	}
}