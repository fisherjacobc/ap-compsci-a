//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 29 Oct 2024
 */
public class DigitMath {
	public static int countDigits(int number) {
		return DigitCounter.go(number);
	}

	public static int sumDigits(int number) {
		return DigitAdder.go(number);
	}

	// method go must call countDigits and sumDigits
	// to receive full credit
	public static double go(int number) {
		return (double) sumDigits(number) / countDigits(number);
	}
}