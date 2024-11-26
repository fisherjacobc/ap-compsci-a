//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 26 Nov 2024
 */
public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.setRational(numerator, denominator);
    }

    private void simplify() {
        int gcd = 1;
        for (int i = 1; i <= Math.min(this.numerator, this.denominator); i++) {
            if (this.numerator % i == 0 && this.denominator % i == 0) {
                gcd = i;
            }
        }

        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public void setRational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.simplify();
    }

    public void add(Rational other) {
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
        this.simplify();
    }

    public boolean isBigger(Rational other) {
        return this.numerator * other.denominator > other.numerator * this.denominator;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}