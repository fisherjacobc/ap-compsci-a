//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 18 Nov 2024
 */
public class Car {
    private int milesDriven;
    private final int oilChangeInterval;
    private int lastOilChangeMileage;

    public Car(int miles, int interval) {
        this.milesDriven = miles;
        this.oilChangeInterval = interval;
        this.lastOilChangeMileage = 0;
    }

    public void addMiles(int miles) {
        this.milesDriven += miles;
    }

    public boolean timeForOilChange() {
        if (this.milesDriven - this.lastOilChangeMileage >= this.oilChangeInterval) {
            this.lastOilChangeMileage = this.milesDriven;
            return true;
        }
        return false;
    }
}