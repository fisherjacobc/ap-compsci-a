//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 9 Dec 2024
 */
public class NumberSearch {
	public static int getNextLargest(int[] numArray, int searchNum) {
		int currentBiggest = Integer.MAX_VALUE;

		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] > searchNum) {
				if (currentBiggest > numArray[i]) {
					currentBiggest = numArray[i];
				}
			}
		}

		return currentBiggest == Integer.MAX_VALUE ? -1 : currentBiggest;
	}
}