//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Arrays;

/**
 * @author Jacob Fisher
 * @created 11 Dec 2024
 */
public class Monsters {
	private Monster[] myMonsters;

	public Monsters(int size) {
		myMonsters = new Monster[size];
	}

	public void add(int spot, Monster m) {
		if (spot < myMonsters.length)
			myMonsters[spot] = m;
	}

	public Monster getLargest() {
		Monster largestMonster = null;

		for (Monster monster : this.myMonsters) {
			if (largestMonster == null || monster.getHowBig() > largestMonster.getHowBig()) {
				largestMonster = monster;
			}
		}

		return largestMonster;
	}

	public Monster getSmallest() {
		Monster smallestMonster = null;

		for (Monster monster : this.myMonsters) {
			if (smallestMonster == null || monster.getHowBig() < smallestMonster.getHowBig()) {
				smallestMonster = monster;
			}
		}

		return smallestMonster;
	}

	public String toString() {
		return Arrays.toString(myMonsters);
	}
}