//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 26 Nov 2024
 */
public class Lesson12Monster {
    private String name;
    private int howBig;

    public Lesson12Monster(String n, int size) {
        this.name = n;
        this.howBig = size;
    }

    public String getName() {
        return this.name;
    }

    public int getHowBig() {
        return this.howBig;
    }

    public boolean isBigger(Lesson12Monster other) {
        return this.howBig > other.getHowBig();
    }

    public boolean isSmaller(Lesson12Monster other) {
        return !this.isBigger(other);
    }
}