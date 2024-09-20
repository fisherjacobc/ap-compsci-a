//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 20 Sep 2024
 */
public class NumberVerify {
	public static boolean isOdd(int num) {
		return num % 2 != 0;
	}

	public static boolean isEven(int num) {
		return !isOdd(num);
	}
}