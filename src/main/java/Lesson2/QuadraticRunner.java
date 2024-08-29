//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Scanner;

/**
 * @author Jacob Fisher
 * @created 29 Aug 2024
 */
public class QuadraticRunner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("Enter a :: ");
			int quadA = keyboard.nextInt();
			System.out.print("Enter b :: ");
			int quadB = keyboard.nextInt();
			System.out.print("Enter c :: ");
			int quadC = keyboard.nextInt();

			Quadratic test = new Quadratic();
			System.out.printf("rootone :: %.2f \n", test.getRootOne(quadA, quadB, quadC));
			System.out.printf("roottwo :: %.2f \n", test.getRootTwo(quadA, quadB, quadC));
		}

		keyboard.close();
	}
}

/*
 * 
 * Sample Data :
 * 5 -8 3
 * 3 2 -7
 * 9 6 1
 * 
 * 
 * Sample Output :
 * Enter a :: 5
 * Enter b :: -8
 * Enter c :: 3
 * 
 * 
 * rootone :: 1.00
 * roottwo :: 0.60
 * 
 * 
 * 
 * 
 * Enter a :: 3
 * Enter b :: 2
 * Enter c :: -7
 * 
 * 
 * rootone :: 1.23
 * roottwo :: -1.90
 * 
 * 
 * 
 * 
 * Enter a :: 9
 * Enter b :: 6
 * Enter c :: 1
 * 
 * 
 * rootone :: -0.33
 * roottwo :: -0.33
 * 
 */