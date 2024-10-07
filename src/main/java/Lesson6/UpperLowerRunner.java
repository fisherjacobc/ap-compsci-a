//(c) A+ Computer Science
// www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 07 Oct 2024
 */
public class UpperLowerRunner {
	public static void main(String args[]) {
		System.out.println(UpperLower.go("D0g", true));
		System.out.println(UpperLower.go("aplus", false));
		System.out.println(UpperLower.go("catgiraffe", false));
		System.out.println(UpperLower.go("ApLuS", true));
		System.out.println(UpperLower.go("ApLuS", false));
		System.out.println(UpperLower.go("#d0G#", true));
		System.out.println(UpperLower.go("#d0G#", false));
		System.out.println(UpperLower.go("aplusdog#13337#", false));
		System.out.println(UpperLower.go("CoEe1234", true));
		System.out.println(UpperLower.go("wow", true));
		System.out.println(UpperLower.go("77777", true));
		System.out.println(UpperLower.go("77777", false));
	}
}