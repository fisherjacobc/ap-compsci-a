//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 16 Sep 2024
 */
public class SwitchFirstRunner {
	public static void main(String args[]) {
		System.out.println(SwitchFirst.go("dog", "cats"));
		System.out.println(SwitchFirst.go("aplus", "pigs"));
		System.out.println(SwitchFirst.go("catgiraffe", "apluscompsci"));
		System.out.println(SwitchFirst.go("ap", "aplus"));
		System.out.println(SwitchFirst.go("pluscat", "dogsaplus"));
		System.out.println(SwitchFirst.go("#", "#"));
		System.out.println(SwitchFirst.go("aplusdog#13337#", "pigaplusprogram"));
		System.out.println(SwitchFirst.go("code", "code1234"));
		System.out.println(SwitchFirst.go("wow", "aplus"));
		System.out.println(SwitchFirst.go("catsand", "aplusdogsaplus"));
		System.out.println(SwitchFirst.go("7", "77777"));
	}
}