//(c) A+ Computer Science
// www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 07 Oct 2024
 */
public class LastFirst {
	public static String check(String s) {
		// Use Character Object instead of char primitive
		Character charOne = s.charAt(0);
		Character charTwo = s.charAt(s.length() - 1);

		if (charOne == charTwo)
			return "apluscompsci";

		return charOne.compareTo(charTwo) > 0 ? "aplus" : "compsci";
	}
}