//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 12 Nov 2024
 */
public class TriangleTwo {
	public static String go(int size, String let) {
		String output = "";

		for (int i = size; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				output += let;
			}
			output += "\n";
		}

		return output;
	}
}