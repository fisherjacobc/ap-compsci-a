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
		char response = 'y';
		RockPaperScissors game = new RockPaperScissors();

		while (response == 'y') {
			out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			String player = keyboard.next();

			game.setPlayers(player.toUpperCase().charAt(0));
			System.out.println("player had " + player.toUpperCase().charAt(0));
			System.out.println("computer had " + game.toString());
			System.out.println(game.determineWinner());

			out.print("\nDo you want to play again? ");
			response = keyboard.next().charAt(0);
		}

		keyboard.close();
	}
}
