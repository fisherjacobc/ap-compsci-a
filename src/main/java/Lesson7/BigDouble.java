//(c) A+ Computer Science
// www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 15 Oct 2024
 */
public class BigDouble {
	public static double getBiggest(double a, double b, double c, double d) {
		if (a > b && a > c && a > d) {
			return a;
		} else if (b > a && b > c && b > d) {
			return b;
		} else if (c > a && c > b && c > d) {
			return c;
		} else {
			return d;
		}
	}
}