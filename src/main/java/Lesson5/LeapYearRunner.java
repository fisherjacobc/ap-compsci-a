//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

/**
 * @author Jacob Fisher
 * @created 20 Sep 2024
 */
public class LeapYearRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a year :: ");
		int year = keyboard.nextInt();
		boolean isLeapYear = LeapYear.isLeapYear(year);
		System.out.println(year + " is " + (isLeapYear ? "" : "NOT ") + "a leap year");
		keyboard.close();
	}
}