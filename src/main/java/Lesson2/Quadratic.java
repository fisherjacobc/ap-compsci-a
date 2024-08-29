//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 29 Aug 2024
 */
public class Quadratic {
	private double getRoot(int a, int b, int c, boolean positive) {
		int positiveModifier = positive ? 1 : -1;

		return (-b + (positiveModifier * Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
	}

	public double getRootOne(int a, int b, int c) {
		return this.getRoot(a, b, c, true);
	}

	public double getRootTwo(int a, int b, int c) {
		return this.getRoot(a, b, c, false);
	}
}