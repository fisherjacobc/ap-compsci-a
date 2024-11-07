//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 7 Nov 2024
 */
public class MultTable {
	private int number;
	private int stop;

	public MultTable(int n, int s) {
		this.number = n;
		this.stop = s;
	}

	public void printTable() {
		System.out.println("multiplication table for " + this.number);
		for (int i = 1; i <= this.stop; i++) {
			System.out.println(i + "\t" + (i * this.number));
		}
	}
}