//(c) A+ Computer Science
// www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 07 Oct 2024
 */
public class AB {
	public static boolean check(String _s, char a, char b) {
		String s = _s.substring(1, _s.length() - 1);
		// check that the char they are looking for exists
		if (s.indexOf(a) == -1 || s.indexOf(b) == -1)
			return false;

		// check if the char they are looking for is to the right
		if (s.indexOf(a) + 1 <= s.length())
			return s.charAt(s.indexOf(a) + 1) == b;

		// check if the char they are looking for is to the left
		if (s.indexOf(a) - 1 >= 0)
			return s.charAt(s.indexOf(a) - 1) == b;

		return false;
	}
}