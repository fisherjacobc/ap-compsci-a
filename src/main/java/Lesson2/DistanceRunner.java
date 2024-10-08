//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Scanner;

/**
 * @author Jacob Fisher
 * @created 29 Aug 2024
 */
public class DistanceRunner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("Enter X1 :: ");
			int x1 = keyboard.nextInt();
			System.out.print("Enter Y1 :: ");
			int y1 = keyboard.nextInt();
			System.out.print("Enter X2 :: ");
			int x2 = keyboard.nextInt();
			System.out.print("Enter Y2 :: ");
			int y2 = keyboard.nextInt();

			Distance reference = new Distance();
			System.out.printf("%.3f \n", reference.getDistance(x1, y1, x2, y2));
		}

		keyboard.close();
	}
}

/*
 * 
 * Sample Data :
 * 1 1 2 1
 * 1 1 -2 2
 * 1 1 0 0
 * 
 * 
 * 
 * Sample Output :
 * Enter X1 :: 1
 * Enter Y1 :: 1
 * Enter X2 :: 2
 * Enter Y2 :: 1
 * distance == 1.000
 * 
 * 
 * Enter X1 :: 1
 * Enter Y1 :: 1
 * Enter X2 :: -2
 * Enter Y2 :: 2
 * distance == 3.162
 * 
 * 
 * Enter X1 :: 1
 * Enter Y1 :: 1
 * Enter X2 :: 0
 * Enter Y2 :: 0
 * distance == 1.414
 * 
 */