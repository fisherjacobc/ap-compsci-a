//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 9 Dec 2024
 */
public class RayTotal {
	public static int go(int[] ray) {
		int total = 0;

		for (int i : ray) {
			total += i;
		}

		return total;
	}
}