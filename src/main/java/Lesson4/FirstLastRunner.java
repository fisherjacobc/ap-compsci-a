//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 16 Sep 2024
 */
public class FirstLastRunner {
	public static void main(String args[]) {
		System.out.println(FirstLast.go("dog", "cats"));
		System.out.println(FirstLast.go("aplus", "pigs"));
		System.out.println(FirstLast.go("catgiraffe", "apluscompsci"));
		System.out.println(FirstLast.go("ap", "aplus"));
		System.out.println(FirstLast.go("pluscat", "dogsaplus"));
		System.out.println(FirstLast.go("#", "#"));
		System.out.println(FirstLast.go("aplusdog#13337#", "pigaplusprogram"));
		System.out.println(FirstLast.go("code", "code1234"));
		System.out.println(FirstLast.go("wow", "eplus"));
		System.out.println(FirstLast.go("catsand", "aplusdogsaplus"));
		System.out.println(FirstLast.go("7", "77777"));
	}
}