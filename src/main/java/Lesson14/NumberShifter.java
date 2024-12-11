//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 9 Dec 2024
 */
public class NumberShifter {
	public static int[] makeLucky7Array(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		return array;
	}

	public static void shiftEm(int[] array) {
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				int temp = array[i];
				array[i] = array[index];
				array[index] = temp;
				index++;
			}
		}
	}
}