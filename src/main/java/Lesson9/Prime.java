//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 4 Nov 2024
 */
public class Prime {
	public static boolean isPrime(int num) {
		boolean prime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				prime = false;
		}

		return prime;
	}
}