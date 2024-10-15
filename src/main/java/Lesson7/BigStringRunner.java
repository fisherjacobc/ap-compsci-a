//(c) A+ Computer Science
// www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 15 Oct 2024
 */
public class BigStringRunner {
	public static void main(String args[]) {
		System.out.println("\"abc\" \"cba\" \"bca\"");
		System.out.println("biggest = \"" + BigString.getBiggest("abc", "cba", "bca") + "\"\n");

		System.out.println("\"one\" \"fourteen\" \"twenty\"");
		System.out.println("biggest = \"" + BigString.getBiggest("one", "fourteen", "twenty") + "\"\n");

		System.out.println("\"124323\" \"20009\" \"3434\"");
		System.out.println("biggest = \"" + BigString.getBiggest("124323", "20009", "3434") + "\"\n");

		System.out.println("\"abcde\" \"ABCDE\" \"1234234324\"");
		System.out.println("biggest = \"" + BigString.getBiggest("abcde", "ABCDE", "1234234324") + "\"\n");
	}
}