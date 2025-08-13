import java.util.Scanner;

public class MonsterRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter monster 1's name: ");
		String name1 = keyboard.next();
		System.out.print("\nEnter monster 1's size: ");
		int size1 = keyboard.nextInt();

		System.out.print("\nEnter monster 2's name: ");
		String name2 = keyboard.next();
		System.out.print("\nEnter monster 2's size: ");
		int size2 = keyboard.nextInt();

		Monster monster1 = new Monster(name1, size1);
		Monster monster2 = new Monster(name2, size2);

		System.out.println("\nMonster 1 - " + monster1);
		System.out.println("Monster 2 - " + monster2);

		System.out
				.println("\nMonster 1 is " + (monster1.isBigger(monster2) ? "bigger" : "smaller") + " than Monster 2.");
		System.out.println("Monster 1 does " + (monster1.namesTheSame(monster2) ? "has" : "does not have")
				+ " the same name as Monster 2.");

		keyboard.close();
	}
}