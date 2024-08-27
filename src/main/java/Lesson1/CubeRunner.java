//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

/**
 * @author Jacob Fisher
 * @created 23 Aug 2024
 */
public class CubeRunner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < 7; i++)
			calculateSurfaceArea(kb);
	}

	public static void calculateSurfaceArea(final Scanner input) {
		System.out.print("Enter the side :: ");
		int side = input.nextInt();

		System.out.println("Cube Area is :: " + 6 * Math.pow(side, 2));
	}
}

/*
 * 
 * Sample Data:
 * 112
 * 4
 * 33
 * 50
 * 5
 * 19
 * 111
 * 
 * 
 * 
 * Sample Output :
 * Cube area is :: 75264.0
 * Cube area is :: 96.0
 * Cube area is :: 6534.0
 * Cube area is :: 15000.0
 * Cube area is :: 150.0
 * Cube area is :: 2166.0
 * Cube area is :: 73926.0
 * 
 * 
 * 
 */
