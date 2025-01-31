//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 9 Dec 2024
 */
public class NumberSorterRunner {
	public static void main(String args[]) {
		int[] cases = { 567891, 901912468, 864213507, 898777, 234422 };
		for (int test : cases) {
			int[] one = NumberSorter.getSortedDigitArray(test);
			for (int item : one) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}
}