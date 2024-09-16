//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 16 Sep 2024
 */
public class LeaveOutRunner {
	public static void main(String args[]) {
		System.out.println(LeaveOut.go("dog", 1));
		System.out.println(LeaveOut.go("aplus", 2));
		System.out.println(LeaveOut.go("catgiraffe", 3));
		System.out.println(LeaveOut.go("ap", 1));
		System.out.println(LeaveOut.go("pluscat", 4));
		System.out.println(LeaveOut.go("aplusdog#13337#", 9));
		System.out.println(LeaveOut.go("code", 2));
		System.out.println(LeaveOut.go("wow", 1));
		System.out.println(LeaveOut.go("catsand", 0));
	}
}