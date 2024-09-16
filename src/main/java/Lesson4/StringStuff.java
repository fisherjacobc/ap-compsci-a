//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 16 Sep 2024
 */
public class StringStuff {
	private String word;

	public StringStuff(String w) {
		this.word = w;
	}

	public String getFirstLastLetters() {
		return this.word.charAt(0) + "" + this.word.charAt(this.word.length() - 1);
	}

	public String getMiddleLetter() {
		return this.word.substring(this.word.length() / 2, this.word.length() / 2 + 1);
	}

	public boolean sameFirstLastLetters() {
		return this.word.charAt(0) == this.word.charAt(this.word.length() - 1);
	}

	public String toString() {
		return word;
	}
}