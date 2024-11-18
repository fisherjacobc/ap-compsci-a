//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 14 Nov 2024
 */
public class BoxWord {
	public static String go(String word) {
		String output = "";
		int length = word.length();

		output += word + "\n";
		for (int i = 1; i < length - 1; i++) {
			output += word.charAt(i);
			for (int j = 1; j < length - 1; j++) {
				output += " ";
			}
			output += word.charAt(length - 1 - i);
			output += "\n";
		}

		if (length > 1)
			output += new StringBuilder(word).reverse().toString();
		output += "\n";

		return output;
	}
}