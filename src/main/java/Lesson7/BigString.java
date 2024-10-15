//(c) A+ Computer Science
// www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 15 Oct 2024
 */
public class BigString {
	public static String getBiggest(String a, String b, String c) {
		if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
			return a;
		} else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
			return b;
		} else {
			return c;
		}
	}
}