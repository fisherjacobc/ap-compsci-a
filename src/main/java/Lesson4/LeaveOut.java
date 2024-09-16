//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 16 Sep 2024
 */
public class LeaveOut {
	// pre : a.length() > 1
	// post : string returned minus character at i
	public static String go(String a, int i) throws IllegalArgumentException {
		if (a.length() <= 1)
			throw new IllegalArgumentException("String must be longer than 1 character");

		return a.substring(0, i) + a.substring(i + 1);
	}
}