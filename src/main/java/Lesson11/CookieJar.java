// (c) A+ Computer Science
// www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 18 Nov 2024
 */
public class CookieJar {
    private int capacity;
    private int numCookies = 0;

    public CookieJar(int cap) {
        this.capacity = cap;
    }

    public int addStuff(int amount) {
        if (this.numCookies + amount > this.capacity) {
            int overflow = this.numCookies + amount - this.capacity;
            this.numCookies = this.capacity;
            return overflow;
        } else {
            this.numCookies += amount;
            return this.numCookies - this.capacity;
        }
    }

    public int spaceLeft() {
        return this.capacity - this.numCookies;
    }

    public boolean isFull() {
        return this.numCookies >= this.capacity;
    }
}