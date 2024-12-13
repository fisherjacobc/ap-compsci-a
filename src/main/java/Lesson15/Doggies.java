//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Arrays;

/**
 * @author Jacob Fisher
 * @created 11 Dec 2024
 */
public class Doggies {
	private Dog[] pups;

	public Doggies(int size) {
		pups = new Dog[size];
	}

	public void set(int spot, int age, String name) {
		if (spot < pups.length)
			pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest() {
		Dog oldestDog = null;

		for (Dog monster : this.pups) {
			if (oldestDog == null || monster.getAge() > oldestDog.getAge()) {
				oldestDog = monster;
			}
		}

		return oldestDog.getName();
	}

	public String getNameOfYoungest() {
		Dog youngestDog = null;

		for (Dog monster : this.pups) {
			if (youngestDog == null || monster.getAge() < youngestDog.getAge()) {
				youngestDog = monster;
			}
		}

		return youngestDog.getName();
	}

	public String toString() {
		return "" + Arrays.toString(pups);
	}
}