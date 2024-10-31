//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 29 Oct 2024
 */
public class CountEvens {
	public static int go(int number) {
		int count = 0;
		while (number > 0) {
			if (number % 2 == 0) {
				count++;
			}
			number /= 10;
		}

		return count;
	}
}