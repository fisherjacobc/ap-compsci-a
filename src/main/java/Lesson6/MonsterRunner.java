//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Scanner;

/**
 * @author Jacob Fisher
 * @created 09 Oct 2024
 */
public class MonsterRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter 1st monster's name : ");
		String name1 = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int size1 = keyboard.nextInt();
		Monster monster1 = new Monster(name1, size1);

		System.out.println("Enter 2nd monster's name : ");
		String name2 = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		Monster monster2 = new Monster(name2, size2);

		boolean bigger = monster1.isBigger(monster2);

		System.out.println("Monster 1 is " + (bigger ? "bigger" : "smaller") + " than Monster 2");
		if (monster1.namesTheSame(monster2))
			System.out.println("Monster 1 has the same name as Monster 2");

		keyboard.close();
	}
}