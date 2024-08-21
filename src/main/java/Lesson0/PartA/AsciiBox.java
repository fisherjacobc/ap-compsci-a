/**
 * @author Jacob Fisher
 * @created 19 Aug 2024
 */
public class AsciiBox {
	public static void main(String[] args) {
		char char1 = '=';
		char char2 = '^';

		System.out.println("Jacob Fisher		19 Aug 2024\n\n");
		drawLines(char1, 3);
		drawLines(char2, 2);
		drawLines(char1, 3);
		drawLines(char2, 2);
		drawLines(char1, 3);
		drawLines(char2, 2);
		drawLines(char1, 3);
	}

	public static void drawLines(final char chosenChar, final int numLines) {
		for (int i = 0; i < numLines; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(chosenChar);
			}
			System.out.print("\n");
		}
	}
}