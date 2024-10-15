//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 15 Oct 2024
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
		int aplusOccurrence = a.split("aplus").length - 1;
		// in case aplus is at the beg/end of the string
		if (aplusOccurrence == 0 && a.contains("aplus"))
			aplusOccurrence = 1;
		int length = a.length();

		if (aplusOccurrence < 1 && length % 2 == 1) {
			return "a";
		} else if (aplusOccurrence >= 1 && length % 2 == 0) {
			return "plus";
		} else if (a.startsWith("aplus") && a.endsWith("aplus")) {
			return "comp";
		} else {
			return "sci";
		}
	}
}

/*
 * 
 * EXPECTED RUNNER OUTPUT
 * 
 * no
 * no
 * no
 * yes
 * no
 * yes
 * no
 * no
 * yes
 * no
 * 
 * 
 * 
 */