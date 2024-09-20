//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 20 Sep 2024
 */
public class StringStuff {
	private String word;

	public StringStuff(String w) {
		word = w;
	}

	public void setString(String w) {
		word = w;
	}

	public boolean isEvenLength() {
		return word.length() % 2 == 0;
	}

	public boolean endsWith(String b) {
		return word.endsWith(b);
	}

	public boolean sameFirstLastLetters() {
		return word.charAt(0) == word.charAt(word.length() - 1);
	}

	public String toString() {
		return word;
	}
}