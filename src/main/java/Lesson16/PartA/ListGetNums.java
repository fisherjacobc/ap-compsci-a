//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jacob Fisher
 * @created 7 Mar 2025
 */
public class ListGetNums {
	// method go will return an array
	// containing the first 3 numbers
	// greater than 11
	public static List<Integer> go(List<Integer> ray) {
		List<Integer> greaterThan11 = new ArrayList<Integer>();

		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i) > 11 && greaterThan11.size() < 3) {
				greaterThan11.add(ray.get(i));
			}
		}

		return greaterThan11;
	}
}