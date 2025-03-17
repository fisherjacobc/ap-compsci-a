public class Chick implements Animal {
    private String myType;
    private String mySound;
    private String myAltSound;
    private boolean hasTwoSounds;

    public Chick(boolean hasTwoSounds) {
        myType = "chick";
        mySound = "cheep";
        myAltSound = "cluck";

        this.hasTwoSounds = hasTwoSounds;
    }

    public String getSound() {
        return (Math.random() < 0.5 || !hasTwoSounds) ? mySound : myAltSound;
    }

    public String getType() {
        return myType;
    }
}