//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 09 Oct 2024
 */
public class Monster {
	private String name;
	private int howBig;

	public Monster(String n, int size) {
		this.name = n;
		this.howBig = size;
	}

	public String getName() {
		return this.name;
	}

	public int getHowBig() {
		return this.howBig;
	}

	public boolean isBigger(Monster other) {
		return this.howBig > other.getHowBig();
	}

	public boolean isSmaller(Monster other) {
		return !this.isBigger(other);
	}

	public boolean namesTheSame(Monster other) {
		return this.name == other.getName();
	}

	public String toString() {
		return this.name + " " + this.howBig;
	}
}