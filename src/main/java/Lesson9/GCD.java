//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 4 Nov 2024
 */
public class GCD {
	public static int getGCD(int numOne, int numTwo) {
		int gcd = 1;

		for (int i = Math.min(numOne, numTwo); i > 0; i--) {
			if (numOne % i == 0 && numTwo % i == 0) {
				gcd = i;
				break;
			}
		}

		return gcd;
	}
}