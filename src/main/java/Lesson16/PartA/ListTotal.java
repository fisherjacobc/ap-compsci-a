
//(c) A+ Computer Science
//www.apluscompsci.com
import java.util.List;

/**
 * @author Jacob Fisher
 * @created 27 Feb 2025
 */
public class ListTotal {
	public static int go(List<Integer> ray) {
		int sum = 0;

		for (int num : ray) {
			sum += num;
		}

		return sum;
	}
}