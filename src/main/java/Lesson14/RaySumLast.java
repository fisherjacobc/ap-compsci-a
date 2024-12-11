//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 9 Dec 2024
 */
public class RaySumLast {
	public static int go(int[] ray) {
		int total = 0;

		for (int i : ray) {
			if (i > ray[ray.length - 1])
				total += i;
		}

		return total == 0 ? -1 : total;
	}
}