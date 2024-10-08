//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 10 Sep 2024
 */
public class DogRunner {
	public static void main(String[] args) {
		Dog d = new Dog("rover");
		System.out.println(d.getPeopleAge(7));
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		System.out.println(d.getPeopleAge(11));
		System.out.println(d.getName());
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		System.out.println(d.getPeopleAge(8));
		Dog g = new Dog("bob", 3);
		System.out.println(g.getName());
		System.out.println(g.getPeopleAge(5));
	}
}