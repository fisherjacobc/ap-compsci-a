//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.List;

/**
 * @author Jacob Fisher
 * @created 7 Mar 2025
 */
public class ListAverage {
	public static double go(List<Integer> ray) {
		int largestNumber = Integer.MIN_VALUE;
		int smallestNumber = Integer.MAX_VALUE;

		for (int num : ray) {
			if (num > largestNumber)
				largestNumber = num;
			if (num < smallestNumber)
				smallestNumber = num;
		}

		return (double) (largestNumber + smallestNumber) / 2;
	}
}