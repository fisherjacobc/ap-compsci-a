/**
 * @author Jacob Fisher
 * @created 19 Aug 2024
 */
public class AsciiBox2 {
	public static void main(String[] args) {
		char char1 = '=';
		char char2 = '+';

		System.out.println("Jacob Fisher		19 Aug 2024\n\n");
		drawLines(char1, 1);
		drawLines(char2, 1);
		drawLinesWithHole(char2, 3);
		drawLinesWithString(char2, "CompSci", 1);
		drawLinesWithHole(char2, 3);
		drawLines(char2, 1);
		drawLines(char1, 1);
	}

	public static void drawLines(final char chosenChar, final int numLines) {
		for (int i = 0; i < numLines; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(chosenChar);
			}
			System.out.print("\n");
		}
	}

	public static void drawLinesWithHole(final char chosenChar, final int numLines) {
		for (int i = 0; i < numLines; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(chosenChar);
			}
			for (int j = 0; j < 14; j++) {
				System.out.print("\s");
			}
			for (int j = 0; j < 3; j++) {
				System.out.print(chosenChar);
			}
			System.out.print("\n");
		}
	}

	public static void drawLinesWithString(final char chosenChar, final String string, final int numLines) {
		int sideSpaces = Math.clamp(14 - string.length(), 0, 14) / 2;
		boolean extraSpace = (string.length() % 2) == 1 && (sideSpaces > 0);

		for (int i = 0; i < numLines; i++) {
			for (int j = 0; j < 3; j++) {
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
			for (int j = 0; j < 3; j++) {
				System.out.print(chosenChar);
			}
			System.out.print("\n");
		}
	}
}