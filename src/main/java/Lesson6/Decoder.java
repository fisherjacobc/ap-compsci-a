//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 07 Oct 2024
 */
public class Decoder {
	public String deCode(char c) {
		char result = c;
		if (Character.isLowerCase(c))
			result = Character.toUpperCase(c);
		else if (Character.isUpperCase(c))
			result = Character.toLowerCase(c);
		else if (Character.isDigit(c))
			// 0-9 becomes A-J
			result = (char) (c + 17);
		else
			result = '#';

		return "" + c + " decodes to " + result;
	}
}