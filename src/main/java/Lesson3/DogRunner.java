//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 10 Sep 2024
 */
public class DogRunner {
	public static void main(String[] args) {
		Lesson3Dog d = new Lesson3Dog("rover");
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
		Lesson3Dog g = new Lesson3Dog("bob", 3);
		System.out.println(g.getName());
		System.out.println(g.getPeopleAge(5));
	}
}