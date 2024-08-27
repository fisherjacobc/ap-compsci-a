//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

/**
 * @author Jacob Fisher
 * @created 23 Aug 2024
 */
public class RectRunner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < 7; i++)
			calculatePerimeter(kb);
	}

	public static void calculatePerimeter(final Scanner input) {
		System.out.print("Enter the length :: ");
		int length = input.nextInt();
		System.out.print("Enter the width :: ");
		int width = input.nextInt();

		System.out.println(length * 2 + width * 2);
	}
}

/*
 * 
 * Sample Data:
 * 12 5
 * 131 75
 * 20 25
 * 9 256
 * 36 72
 * 8 6
 * 18 16
 * 
 * 
 * Sample Output :
 * 34.0
 * 412.0
 * 90.0
 * 530.0
 * 216.0
 * 28.0
 * 68.0
 * 
 */
