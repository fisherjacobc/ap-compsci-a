//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 12 Nov 2024
 */
public class TriangleThree {
	public static String go(int size, String let) {
		String output = "";

		for (int i = 1; i <= size; i++) {
			for (int j = size; j > i; j--) {
				output += " ";
			}
			for (int j = 0; j < i; j++) {
				output += let;
			}
			output += "\n";
		}

		return output;
	}
}