//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Scanner;

/**
 * @author Jacob Fisher
 * @created 11 Dec 2024
 */
public class DoggiesRunner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("How many Dogs are in the pack? :: ");
		int size = keyboard.nextInt();
		Doggies pack = new Doggies(size);
		System.out.println();

		for (int i = 0; i < size; i++) {
			System.out.print("Enter the age :: ");
			int age = keyboard.nextInt();
			System.out.print("Enter the name :: ");
			String name = keyboard.next();

			pack.set(i, age, name);
			System.out.println();
		}

		System.out.println("pack :: " + pack);
		System.out.println();
		System.out.println("NAME OF OLDEST :: " + pack.getNameOfOldest());
		System.out.println();
		System.out.println("NAME OF YOUNGEST :: " + pack.getNameOfYoungest());

		keyboard.close();
	}
}