//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 7 Nov 2024
 */
public class WordRunner {
	public static void main(String[] args) {
		Word test = new Word("Hello");
		System.out.println(test.getFirstChar());
		System.out.println(test.getLastChar());
		System.out.println(test.getBackWards());
		System.out.println(test);
		System.out.println("\n");

		test = new Word("World");
		System.out.println(test.getFirstChar());
		System.out.println(test.getLastChar());
		System.out.println(test.getBackWards());
		System.out.println(test);
		System.out.println("\n");

		test = new Word("JukeBox");
		System.out.println(test.getFirstChar());
		System.out.println(test.getLastChar());
		System.out.println(test.getBackWards());
		System.out.println(test);
		System.out.println("\n");

		test = new Word("TCEA");
		System.out.println(test.getFirstChar());
		System.out.println(test.getLastChar());
		System.out.println(test.getBackWards());
		System.out.println(test);
		System.out.println("\n");

		test = new Word("UIL");
		System.out.println(test.getFirstChar());
		System.out.println(test.getLastChar());
		System.out.println(test.getBackWards());
		System.out.println(test);
		System.out.println("\n");
	}
}