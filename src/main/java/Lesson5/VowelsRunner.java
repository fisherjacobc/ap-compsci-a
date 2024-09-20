//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 20 Sep 2024
 */
public class VowelsRunner {
	public static void main(String args[]) {
		System.out.println(Vowels.go("dog#cat#pigaplus"));
		System.out.println(Vowels.go("pigs#apluscompsci#food"));
		System.out.println(Vowels.go("##catgiraffeapluscompsci"));
		System.out.println(Vowels.go("apluscatsanddogsaplus###"));
		System.out.println(Vowels.go("##"));
		System.out.println(Vowels.go("aplusdog#13337#pigaplusprogram"));
		System.out.println(Vowels.go("code#H00P#code1234"));
		System.out.println(Vowels.go("##wowgira77##eplus"));
		System.out.println(Vowels.go("catsandaplusdogsaplus###"));
		System.out.println(Vowels.go("7"));
		System.out.println(Vowels.go("a"));
		System.out.println(Vowels.go("E"));
		System.out.println(Vowels.go("9AEIOUaeiou8"));
	}
}
