//(c) A+ Computer Science
// www.apluscompsci.com

import java.util.Scanner;
import static java.lang.System.*;

/**
 * @author Jacob Fisher
 * @created 15 Oct 2024
 */
public class RockPaperScissors {
	private static char[] choices = { 'R', 'P', 'S' };
	private char playChoice;
	private char compChoice;

	public RockPaperScissors(char playerChoice) {
		this.playChoice = playerChoice;
	}

	public String determineWinner() {
		this.compChoice = choices[(int) (Math.random() * 3)];

		if (this.playChoice == this.compChoice)
			return "!Draw Game!";

		if (this.playChoice == 'R' && this.compChoice == 'S')
			return "!Player wins <<Rock Breaks Scissors>>!";

		if (this.playChoice == 'P' && this.compChoice == 'R')
			return "!Player wins <<Paper Covers Rock>>!";

		if (this.playChoice == 'S' && this.compChoice == 'P')
			return "!Player wins <<Scissors Cuts Paper>>!";

		if (this.compChoice == 'R' && this.playChoice == 'S')
			return "!Computer wins <<Rock Breaks Scissors>>!";

		if (this.compChoice == 'P' && this.playChoice == 'R')
			return "!Computer wins <<Paper Covers Rock>>!";

		if (this.compChoice == 'S' && this.playChoice == 'P')
			return "!Computer wins <<Scissors Cuts Paper>>!";

		return "how did we get here?";
	}

	public String toString() {
		String output = "";
		return output;
	}
}