//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 07 Oct 2024
 */
public class Grade {
	public static String getLetterGrade(int numGrade) {
		if (numGrade >= 90) {
			return "A";
		} else if (numGrade >= 80 && numGrade < 90) {
			return "B";
		} else if (numGrade >= 75 && numGrade < 80) {
			return "C";
		} else if (numGrade >= 70 && numGrade < 75) {
			return "D";
		} else {
			return "F";
		}
	}
}