//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 9 Dec 2024
 */
public class NumberSorter {
	// instance variables and other methods not shown

	private static int getNumDigits(int number) {
		int count = 0;

		while (number > 0) {
			number /= 10;
			count++;
		}

		return count;
	}

	private static int[] numberToArray(int number) {
		int[] arr = new int[getNumDigits(number)];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = number % 10;
			number /= 10;
		}

		return arr;
	}

	public static int[] getSortedDigitArray(int number) {
		int[] array = numberToArray(number);

		int[] sorted = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}
			sorted[i] = min;
			array[minIndex] = Integer.MAX_VALUE;
		}

		return sorted;
	}
}