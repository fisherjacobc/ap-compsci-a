//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 20 Sep 2024
 */
public class AddSubMult {
	public static double check(double a, double b) {
		if (a > b)
			return a - b;
		if (b > a)
			return b - a;
		return a * b;
	}
}