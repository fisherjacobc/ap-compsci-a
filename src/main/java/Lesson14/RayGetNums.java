//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 9 Dec 2024
 */
public class RayGetNums {
	// method go will return an array
	// containing the first 3 numbers
	// greater than 11
	public static int[] go(int[] ray) {
		int[] result = new int[3];

		int greaterFound = 0;

		for (int i : ray) {
			if (i > 11) {
				result[greaterFound] = i;
				greaterFound++;
			}

			if (greaterFound >= 3)
				break;
		}

		return result;
	}
}