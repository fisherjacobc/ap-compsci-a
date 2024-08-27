//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

/**
 * @author Jacob Fisher
 * @created 23 Aug 2024
 */
public class TrapRunner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < 6; i++)
			calculateArea(kb);
	}

	public static void calculateArea(final Scanner input) {
		System.out.print("Enter the base1 :: ");
		int base1 = input.nextInt();
		System.out.print("Enter the base2 :: ");
		int base2 = input.nextInt();
		System.out.print("Enter the height :: ");
		int height = input.nextInt();

		System.out.println(0.5 * (base1 + base2) * height);
	}
}

/*
 * 
 * 
 * Sample Data:
 * 3 3 3
 * 5 6 7
 * 7 10 6
 * 13 9 3
 * 6 11 4
 * 11 8 5
 * 
 * 
 * Sample Output :
 * 9.0
 * 38.5
 * 51.0
 * 33.0
 * 34.0
 * 47.5
 * 
 * 
 * 
 * 
 */
