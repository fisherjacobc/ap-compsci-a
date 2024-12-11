//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 09 Oct 2024
 */
public class Lesson6Monster {
	private String name;
	private int howBig;

	public Lesson6Monster(String n, int size) {
		this.name = n;
		this.howBig = size;
	}

	public String getName() {
		return this.name;
	}

	public int getHowBig() {
		return this.howBig;
	}

	public boolean isBigger(Lesson6Monster other) {
		return this.howBig > other.getHowBig();
	}

	public boolean isSmaller(Lesson6Monster other) {
		return !this.isBigger(other);
	}

	public boolean namesTheSame(Lesson6Monster other) {
		return this.name.equals(other.getName());
	}

	public String toString() {
		return this.name + " " + this.howBig;
	}
}