//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 29 Oct 2024
 */
public class LetterRemover {
	public static String removeLetters(String sentence, char rem) {
		return sentence.replaceAll("" + rem, "");
	}
}