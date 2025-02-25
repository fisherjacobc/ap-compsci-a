//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 10 Sep 2024
 */
public class Lesson3Dog {
  private int age;
  private String name;

  public Lesson3Dog(String n) {
    age = 1;
    name = n;
  }

  public Lesson3Dog(String n, int a) {
    age = a;
    name = n;
  }

  public void increaseAgeByOne() {
    this.age += 1;
  }

  public int getPeopleAge(int val) {
    return this.age * val;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return "Dog - " + name + " " + age;
  }
}
