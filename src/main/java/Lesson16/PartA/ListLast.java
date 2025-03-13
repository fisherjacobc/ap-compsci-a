//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.List;

/**
 * @author Jacob Fisher
 * @created 7 Mar 2025
 */
public class ListLast {
	public static boolean go(List<Integer> ray) {
		int lastValue = ray.getLast();

		for (int i = 0; i < ray.size() - 1; i++) {
			if (ray.get(i) == lastValue) {
				return true;
			}
		}

		return false;
	}
}