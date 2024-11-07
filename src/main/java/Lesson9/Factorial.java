//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 4 Nov 2024
 */
public class Factorial {
	public static int getFactorial(int num) {
		int total = num;
		for (int i = num - 1; i > 0; i--) {
			total *= i;
		}

		return total;
	}
}