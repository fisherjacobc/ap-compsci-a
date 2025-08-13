import static java.lang.System.*;

public class Monster {
	private String name;
	private int howBig;

	public Monster() {
		this("", 0);
	}

	public Monster(String n, int size) {
		name = n;
		howBig = size;
	}

	public String getName() {
		return name;
	}

	public int getHowBig() {
		return howBig;
	}

	public boolean isBigger(Monster other) {
		return other.getHowBig() < howBig;
	}

	public boolean isSmaller(Monster other) {
		return !isBigger(other);
	}

	public boolean namesTheSame(Monster other) {
		return other.getName().equals(name);
	}

	public String toString() {
		return name + " " + howBig;
	}
}