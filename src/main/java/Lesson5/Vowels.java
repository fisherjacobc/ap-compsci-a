//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 20 Sep 2024
 */
public class Vowels {
	public static boolean hasVowel(String a) {
		String lowered = a.toLowerCase();
		String vowels = "aeiou";

		boolean vowelPresent = false;
		for (int i = 0; i < vowels.length(); i++) {
			if (lowered.charAt(0) == vowels.charAt(i))
				vowelPresent = true;
			if (lowered.charAt(lowered.length() - 1) == vowels.charAt(i))
				vowelPresent = true;
		}
		return vowelPresent;
	}

	public static String go(String a) {
		if (hasVowel(a))
			return "yes";

		return "no";
	}
}