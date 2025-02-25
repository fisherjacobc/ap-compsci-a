//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 11 Dec 2024
 */
public class Monster {
	private int height;
	private int weight;
	private int age;

	public Monster(int height, int weight, int age) {
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	public int getHowBig() {
		return this.height;
	}

	public boolean isBigger(Monster other) {
		return this.getHowBig() > other.getHowBig();
	}

	public boolean isSmaller(Monster other) {
		return !this.isBigger(other);
	}

	public String toString() {
		return this.height + " " + this.weight + " " + this.age;
	}
}