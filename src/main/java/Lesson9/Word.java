//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 7 Nov 2024
 */
public class Word {
	private String word;

	public Word(String s) {
		this.word = s;
	}

	public char getFirstChar() {
		return this.word.charAt(0);
	}

	public char getLastChar() {
		return this.word.charAt(this.word.length() - 1);
	}

	public String getBackWards() {
		String back = "";
		for (int i = this.word.length() - 1; i >= 0; i--) {
			back += this.word.charAt(i);
		}
		return back;
	}

	public String toString() {
		return this.word;
	}
}