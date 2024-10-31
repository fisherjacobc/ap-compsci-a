//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 29 Oct 2024
 */
public class LetterRemoverRunner {
	public static void main(String args[]) {
		System.out.println("I am Sam I am - letter to remove 'a'");
		System.out.println(LetterRemover.removeLetters("I am Sam I am", 'a'));
		System.out.println("\nssssssssxssssesssssesss - letter to remove 's'");
		System.out.println(LetterRemover.removeLetters("ssssssssxssssesssssesss", 's'));
		System.out.println("\nqwertyqwertyqwerty - letter to remove 'a'");
		System.out.println(LetterRemover.removeLetters("qwertyqwertyqwerty", 'a'));
		System.out.println("\nabababababa - letter to remove 'b'");
		System.out.println(LetterRemover.removeLetters("abababababa", 'b'));
		System.out.println("\nabaababababa - letter to remove 'x'");
		System.out.println(LetterRemover.removeLetters("abaababababa", 'x'));
	}
}