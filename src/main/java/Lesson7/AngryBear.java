//(c) A+ Computer Science
// www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 15 Oct 2024
 */
public class AngryBear {
    private int daysAwake;
    private int teeth;

    public AngryBear(int one, int two) {
        this.daysAwake = one;
        this.teeth = two;
    }

    public boolean isAngry() {
        if (this.daysAwake > 3 && this.teeth < 10)
            return true;
        if (this.teeth == 0)
            return true;
        if (this.daysAwake > 5)
            return true;

        return false;
    }
}