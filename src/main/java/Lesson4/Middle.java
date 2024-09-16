//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 16 Sep 2024
 */
public class Middle {
	// pre : a.length() > 1
	// post : midddle letter of string a returned
	public static String go(String a) throws IllegalArgumentException {
		if (a.length() <= 1)
			throw new IllegalArgumentException("String must be longer than 1 character");

		return a.substring(a.length() / 2, a.length() / 2 + 1);
	}
}