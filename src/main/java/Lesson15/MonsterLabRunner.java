//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Scanner;

/**
 * @author Jacob Fisher
 * @created 11 Dec 2024
 */
public class MonsterLabRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);
		System.out.println();

		for (int i = 0; i < size; i++) {
			System.out.print("Enter the height :: ");
			int monsterHeight = keyboard.nextInt();

			System.out.print("Enter the weight :: ");
			int monsterWeight = keyboard.nextInt();

			System.out.print("Enter the age :: ");
			int monsterAge = keyboard.nextInt();

			herd.add(i, new Monster(monsterHeight, monsterWeight, monsterAge));
			System.out.println();
		}

		System.out.println("HERD :: " + herd);
		System.out.println();
		System.out.println("SMALLEST :: " + herd.getSmallest());
		System.out.println();
		System.out.println("LARGEST :: " + herd.getLargest());

		keyboard.close();
	}
}