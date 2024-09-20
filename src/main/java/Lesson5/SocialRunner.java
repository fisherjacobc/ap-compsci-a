//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 20 Sep 2024
 */
public class SocialRunner {
	public static void main(String args[]) {
		System.out.println(new Social("463-44-5678").go());
		System.out.println(new Social("46-144-5678").go());
		System.out.println(new Social("111-44-5678").go());
		System.out.println(new Social("463044-5678").go());
		System.out.println(new Social("463-99-8888").go());
		System.out.println(new Social("123-11-5323").go());
		System.out.println(new Social("463-4-55678").go());
		System.out.println(new Social("46314415678").go());
	}
}