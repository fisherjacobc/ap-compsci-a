//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.List;

/**
 * @author Jacob Fisher
 * @created 7 Mar 2025
 */
public class ListMostFreq {
	// method go will return the value
	// that appears the most
	// if several numbers all appear
	// the same number of times
	// return the first number found
	public static int go(List<Integer> ray) {
		int most = ray.get(0);
		int mostCount = 0;

		for (int i = 0; i < ray.size(); i++) {
			int count = 0;
			for (int j = i + 1; j < ray.size(); j++) {
				if (ray.get(i) == ray.get(j))
					count++;
			}

			if (count > mostCount) {
				most = ray.get(i);
				mostCount = count;
			}
		}

		return most;
	}
}