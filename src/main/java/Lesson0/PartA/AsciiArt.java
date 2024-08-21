/**
 * @author Jacob Fisher
 * @created 21 Aug 2024
 */
public class AsciiArt {
	public static void main(String[] args) {
		char mainChar = '#';

		System.out.println("Jacob Fisher		21 Aug 2024\n\n");

		// Main Body
		System.out.println("\\             /");
		System.out.println(" \\           /");
		drawLines(mainChar, 1);
		drawLinesWithHole(mainChar, 1);
		drawLinesWithString(mainChar, "{0 0}", 1);
		drawLinesWithHole(mainChar, 1);
		drawLinesWithString(mainChar, ">", 1);
		drawLinesWithString(mainChar, "[___]", 1);
		drawLinesWithHole(mainChar, 1);
		drawLines(mainChar, 1);

		// Legs
		for (int j = 0; j < 5; j++) {
			System.out.println("   \"       \"   ");
		}
		System.out.println("\"\"\"\"       \"\"\"\"");
	}

	public static void drawLines(final char chosenChar, final int numLines) {
		for (int i = 0; i < numLines; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(chosenChar);
			}
			System.out.print("\n");
		}
	}

	public static void drawLinesWithHole(final char chosenChar, final int numLines) {
		for (int i = 0; i < numLines; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(chosenChar);
			}
			for (int j = 0; j < 11; j++) {
				System.out.print("\s");
			}
			for (int j = 0; j < 2; j++) {
				System.out.print(chosenChar);
			}
			System.out.print("\n");
		}
	}

	public static void drawLinesWithString(final char chosenChar, final String string, final int numLines) {
		int sideSpaces = Math.clamp(11 - string.length(), 0, 11) / 2;
		boolean extraSpace = false;

		for (int i = 0; i < numLines; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(chosenChar);
			}
			for (int j = 0; j < sideSpaces; j++) {
				System.out.print("\s");
			}
			System.out.print(string);
			if (extraSpace)
				System.out.print("\s");
			for (int j = 0; j < sideSpaces; j++) {
				System.out.print("\s");
			}
			for (int j = 0; j < 2; j++) {
				System.out.print(chosenChar);
			}
			System.out.print("\n");
		}
	}
}