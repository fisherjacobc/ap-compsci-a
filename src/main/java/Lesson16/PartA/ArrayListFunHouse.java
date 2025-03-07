
//(c) A+ Computer Science
//www.apluscompsci.com
import java.util.List;
import java.util.ArrayList;

/**
 * @author Jacob Fisher
 * @created 7 Mar 2025
 */
public class ArrayListFunHouse {
	public static ArrayList<Integer> getListOfFactors(int number) {
		ArrayList<Integer> factors = new ArrayList<Integer>();

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				factors.add(i);
			}
		}

		return factors;
	}

	public static void keepOnlyCompositeNumbers(List<Integer> nums) {
		for (int i = 0; i < nums.size(); i++) {
			if (getListOfFactors(nums.get(i)).size() == 0) {
				nums.remove(i);
				i--;
			}
		}
	}
}