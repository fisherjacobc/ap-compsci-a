//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Arrays;

/**
 * @author Jacob Fisher
 * @created 9 Dec 2024
 */
public class NumberShifterRunner {
	public static void main(String args[]) {
		int[] array1 = NumberShifter.makeLucky7Array(20);
		System.out.println(Arrays.toString(array1));
		NumberShifter.shiftEm(array1);
		System.out.println(Arrays.toString(array1));
		System.out.println();

		int[] array2 = NumberShifter.makeLucky7Array(20);
		System.out.println(Arrays.toString(array2));
		NumberShifter.shiftEm(array2);
		System.out.println(Arrays.toString(array2));
		System.out.println();

		int[] array3 = NumberShifter.makeLucky7Array(20);
		System.out.println(Arrays.toString(array3));
		NumberShifter.shiftEm(array3);
		System.out.println(Arrays.toString(array3));
	}
}
