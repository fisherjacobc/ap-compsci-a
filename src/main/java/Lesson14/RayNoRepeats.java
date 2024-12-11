//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 9 Dec 2024
 */
public class RayNoRepeats {
	// method go will return true if there
	// are no numbers that repeat
	// false if any numbers repeat
	public static boolean go(int[] ray) {
		for (int i = 0; i < ray.length; i++) {
			for (int j = i + 1; j < ray.length; j++) {
				if (ray[i] == ray[j]) {
					return false;
				}
			}
		}
		return true;
	}
}