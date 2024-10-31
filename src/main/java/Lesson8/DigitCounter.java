//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 29 Oct 2024
 */
public class DigitCounter {
	public static int go(int number) {
		int count = 0;
		while (number > 0) {
			number /= 10;
			count++;
		}

		return count;
	}
}