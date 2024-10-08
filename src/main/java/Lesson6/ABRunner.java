//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 07 Oct 2024
 */
public class ABRunner {
	public static void main(String args[]) {
		System.out.println(AB.check("chicken", 'a', 'b'));
		System.out.println(AB.check("frog", 'f', 'g'));
		System.out.println(AB.check("chicken", 'c', 'k'));
		System.out.println(AB.check("apluscompsci", 'a', 's'));
		System.out.println(AB.check("apluscompsci", 'a', 'p'));
		System.out.println(AB.check("apluscompsci", 's', 'c'));
		System.out.println(AB.check("apluscompsci", 'c', 'p'));
	}
}