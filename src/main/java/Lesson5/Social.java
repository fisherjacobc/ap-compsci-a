//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 20 Sep 2024
 */
public class Social {
	private String num;

	public Social(String n) {
		this.num = n;
	}

	private boolean isValid() {
		if (num.charAt(3) != '-' || num.charAt(6) != '-')
			return false;

		return true;
	}

	public String go() {
		if (!isValid())
			return "bad";

		return num.substring(7);
	}
}
