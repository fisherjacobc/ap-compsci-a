//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Arrays;

/**
 * @author Jacob Fisher
 * @created 7 Mar 2025
 */
public class LastRunner {
	public static void main(String args[]) {
		System.out.println(ListLast.go(Arrays.asList(-99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5)));
		System.out.println(ListLast.go(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99)));
		System.out.println(ListLast.go(Arrays.asList(10, 20, 30, 40, 50, -11818, 40, 30, 20, 10)));
		System.out.println(ListLast.go(Arrays.asList(32767)));
		System.out.println(ListLast.go(Arrays.asList(7, 7, 7, 7)));
		System.out.println(ListLast.go(Arrays.asList(9, 10, -88, 100, -555, 1000)));
		System.out.println(ListLast.go(Arrays.asList(10, 10, 10, 11, 456)));
		System.out.println(ListLast.go(Arrays.asList(-111, 1, 2, 3, 9, 11, 20, 30)));
		System.out.println(ListLast.go(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 0, -2, 9, 9)));
		System.out.println(ListLast.go(Arrays.asList(12, 15, 18, 21, 23, 10, 12)));
		System.out.println(ListLast.go(Arrays.asList(250, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, -455)));
		System.out.println(ListLast.go(Arrays.asList(9, 10, -8, 10000, -5000, 1000)));
	}
}