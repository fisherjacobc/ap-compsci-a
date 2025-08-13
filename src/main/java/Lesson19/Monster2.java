public class Monster2 implements Comparable<Monster2> {
    private int height;
    private int weight;
    private int age;

    public Monster2() {
        this(0, 0, 0);
    }

    public Monster2(int height) {
        this(height, 0, 0);
    }

    public Monster2(int height, int weight) {
        this(height, weight, 0);
    }

    public Monster2(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public Object clone() {
        return new Monster2(height, weight, age);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Monster2) {
            Monster2 other = (Monster2) obj;
            return height == other.height && weight == other.weight && age == other.age;
        }

        return false;
    }

    public int compareTo(Monster2 obj) {
        if (obj instanceof Monster2) {
            Monster2 other = (Monster2) obj;

            if (this.equals(other))
                return 0;

            if (this.getHeight() > other.getHeight() || this.getWeight() > other.getWeight()
                    || this.getAge() > other.getAge())
                return 1;
        }

        return -1;
    }

    public String toString() {
        return "" + height + " " + weight + " " + age;
    }
}