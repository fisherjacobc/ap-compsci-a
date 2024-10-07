//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 07 Oct 2024
 */
public class MoreMoreAplus {
	/*
	 * Return "a" if the string does not contain an occurence of "aplus" and has an
	 * odd length.
	 * Return "plus" if the string has at least 1 occurence of "aplus" and the
	 * length is even.
	 * Return "comp" if an "aplus" if found starting at position 0 and at the end of
	 * the string.
	 * Return "sci" in all other situations.
	 */
	public static String go(String a) {
		if (a.length() % 2 == 1 && a.indexOf("aplus") == -1)
			return "a";
		if (a.length() % 2 == 0 && a.indexOf("aplus") != -1)
			return "plus";
		if (a.indexOf("aplus") == 0 && a.lastIndexOf("aplus") + 5 == a.length())
			return "comp";
		return "sci";
	}
}