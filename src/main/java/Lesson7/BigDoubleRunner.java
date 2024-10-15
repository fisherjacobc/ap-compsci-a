//(c) A+ Computer Science
// www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 15 Oct 2024
 */
public class BigDoubleRunner {
	public static void main(String[] args) {
		System.out.println("4.5 6.7 7.8 9.0");
		System.out.println("biggest = " + BigDouble.getBiggest(4.5, 6.7, 7.8, 9.0) + "\n");

		System.out.println("14.51 6.17 71.8 1.0");
		System.out.println("biggest = " + BigDouble.getBiggest(14.51, 6.17, 71.8, 1.0) + "\n");

		System.out.println("41.15 816.7 17.8 19.0");
		System.out.println("biggest = " + BigDouble.getBiggest(41.15, 816.7, 17.8, 19.0) + "\n");

		System.out.println("884.5 16.7 7.8 9.0");
		System.out.println("biggest = " + BigDouble.getBiggest(884.5, 16.7, 7.8, 9.0) + "\n");

		System.out.println("4.5 -456.7 677.8 9.0");
		System.out.println("biggest = " + BigDouble.getBiggest(4.5, -456.7, 677.8, 9.0) + "\n");

		System.out.println("4.5 16.7 -7.8 -9.0");
		System.out.println("biggest = " + BigDouble.getBiggest(4.5, 16.7, -7.8, -9.0) + "\n");
	}
}