//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 4 Nov 2024
 */
public class ForLoopDemo {
	// instance variables and constructors could be used, but are not really needed

	// runForLoop() will run a for loop from start to stop going up by increment
	public static void runForLoop(int start, int stop, int increment) {
		System.out.println("start: " + start + " stop: " + stop + " increment: " + increment);
		String output = "";

		for (int i = start; i < stop; i += increment) {
			output += i + " ";
		}

		System.out.println(output);
	}
}