//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 29 Oct 2024
 */
public class JavaLoopLabRunner {
	public static void main(String args[]) {
		int[] cases = { 234, 10000, 111, 9005, 84645, 8547, 123456789, 55556468, 8525455, 8514548, 111111, 1212121212,
				222222 };

		for (int val : cases) {
			// System.out.println(DigitCounter.go(val));
			// System.out.println(DigitAdder.go(val));
			// System.out.println(DigitMath.go(val));
			// System.out.println(CountEvens.go(val));
			System.out.println(CountOdds.go(val));
		}
	}
}