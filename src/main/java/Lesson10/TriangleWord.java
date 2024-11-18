//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 14 Nov 2024
 */
public class TriangleWord {
	private String word;

	public TriangleWord(String w) {
		this.word = w;
	}

	public String toString() {
		String output = "";

		for (int i = 0; i < this.word.length() - 1; i++) {
			for (int j = 0; j < this.word.length() - i - 1; j++) {
				output += " ";
			}
			output += this.word.charAt(i);

			for (int j = 0; j < i * 2 - 1; j++) {
				output += " ";
			}

			if (i > 0)
				output += this.word.charAt(i);

			output += "\n";
		}

		output += new StringBuilder(this.word).reverse().toString();
		output += this.word.substring(1);
		output += "\n";

		return output;
	}
}