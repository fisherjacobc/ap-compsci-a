//(c) A+ Computer Science
// www.apluscompsci.com

import java.util.Scanner;
import static java.lang.System.*;

/**
 * @author Jacob Fisher
 * @created 15 Oct 2024
 */
public class RPSRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		char response;

		// add in a do while loop after you get the basics up and running
		out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
		String player = keyboard.next();

		RockPaperScissors game = new RockPaperScissors(player.toUpperCase().charAt(0));
		System.out.println(game.determineWinner());

		keyboard.close();
	}
}
