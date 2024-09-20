
//(c) A+ Computer Science
//www.apluscompsci.com
import java.util.*;

/**
 * @author Jacob Fisher
 * @created 20 Sep 2024
 */
public class NumberVerifyRunner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a whole number :: ");
		int num = keyboard.nextInt();
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		keyboard.close();
	}
}