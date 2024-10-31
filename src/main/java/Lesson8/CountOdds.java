//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 29 Oct 2024
 */
public class CountOdds {
	public static int go(int number) {
		int count = 0;
		while (number > 0) {
			if (number % 2 == 1) {
				count++;
			}
			number /= 10;
		}

		return count;
	}
}