//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

/**
 * @author Jacob Fisher
 * @created 23 Aug 2024
 */
public class ConeRunner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < 8; i++)
			calculateVolume(kb);
	}

	public static void calculateVolume(final Scanner input) {
		System.out.print("Enter the radius :: ");
		double radius = input.nextDouble();
		System.out.print("Enter the height :: ");
		double height = input.nextDouble();

		System.out.println((Math.PI / 3) * Math.pow(radius, 2) * height);
	}
}

/*
 * 
 * Sample Data:
 * 4 4
 * 4 3
 * 9 3
 * 1 3
 * 1 5
 * 7 7
 * 1.5 3
 * 1.5 5
 * 
 * 
 * 
 * Sample Output :
 * 67.02
 * 50.27
 * 254.47
 * 3.14
 * 5.24
 * 359.19
 * 7.07
 * 11.78
 * 
 * 
 */
