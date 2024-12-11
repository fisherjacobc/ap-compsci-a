//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 9 Dec 2024
 */
public class RayDown {
	// go() will return true if all numbers in numArray
	// are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray) {
		boolean decreasing = true;
		int lastNumber = Integer.MAX_VALUE;

		for (int i : numArray) {
			if (i > lastNumber || i == lastNumber) {
				decreasing = false;
				break;
			}

			lastNumber = i;
		}

		return decreasing;
	}
}