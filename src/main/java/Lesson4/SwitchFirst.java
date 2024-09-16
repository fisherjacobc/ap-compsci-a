//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 16 Sep 2024
 */
public class SwitchFirst {
	public static String go(String a, String b) {
		char firstCharOfB = b.charAt(0);

		return firstCharOfB + a.substring(1);
	}
}