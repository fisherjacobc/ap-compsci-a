//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 20 Sep 2024
 */
public class WordMixer {
	public static String moveEmAround(String a, int x) {
		if (x > a.length())
			return "no can do";
		if (x == a.length())
			return a;

		return a.substring(x) + a.substring(0, x);
	}
}