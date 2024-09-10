//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 10 Sep 2024
 */
public class Triangle {
	private int sideA, sideB, sideC;
	private double perimeter;

	public Triangle(int a, int b, int c) {
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter() {
		perimeter = sideA + sideB + sideC;
	}

	public double getArea() {
		double perimHalf = perimeter / 2;
		return Math.sqrt(perimHalf * (perimHalf - sideA) * (perimHalf - sideB) * (perimHalf - sideC));
	}
}