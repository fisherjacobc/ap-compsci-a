//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

/**
 * @author Jacob Fisher
 * @created 27 Aug 2024
 */
public class CircleRunner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < 6; i++)
			calculateArea(kb);
	}

	public static void calculateArea(final Scanner input) {
		System.out.print("Enter the radius :: ");
		double radius = input.nextDouble();

		double circleArea = Math.PI * Math.pow(radius, 2);

		System.out.printf("Circle area is :: %.2f\n", circleArea);
	}
}

/*
 * 
 * Sample Data:
 * 7.5
 * 10
 * 72.534
 * 55
 * 101
 * 99.952
 * 
 * 
 * 
 * 
 * Sample Output :
 * Circle area is :: 176.71
 * Circle area is :: 314.16
 * Circle area is :: 16528.49
 * Circle area is :: 9503.32
 * Circle area is :: 32047.39
 * Circle area is :: 31385.77
 * 
 * 
 * 
 * 
 * 
 */
