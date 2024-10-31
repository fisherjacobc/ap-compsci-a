//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 29 Oct 2024
 */
public class Divisors {
	public static String getDivisors(int number) {
		String divisors = number + " has divisors ";
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				divisors += i + " ";
			}
		}
		return divisors;
	}
}