//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Arrays;

/**
 * @author Jacob Fisher
 * @created 13 Dec 2024
 */
public class WordSort {
	private String[] wordRay;

	public WordSort(String line) {
		this.setList(line);
		this.sort();
	}

	public void setList(String line) {
		this.wordRay = line.split(" ");
	}

	public void sort() {
		Arrays.sort(this.wordRay);
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < this.wordRay.length; i++) {
			output += "word " + i + " :: " + this.wordRay[i] + "\n";
		}
		return output;
	}
}