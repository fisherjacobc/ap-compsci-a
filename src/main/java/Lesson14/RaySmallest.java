//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 9 Dec 2024
 */
public class RaySmallest {
	public static int go(int[] ray) {
		int smallest = Integer.MAX_VALUE;

		for (int i : ray) {
			if (i < smallest)
				smallest = i;
		}

		return smallest;
	}
}