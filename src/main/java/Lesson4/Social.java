//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 16 Sep 2024
 */
public class Social {
	private String socialNum;
	private int sum;

	public Social() {
	}

	public Social(String soc) {
		this.setWord(soc);
	}

	public void setWord(String w) {
		this.socialNum = w;
		this.sum = 0;
		this.chopAndAdd();
	}

	public void chopAndAdd() {
		int dash1 = socialNum.indexOf("-");
		int dash2 = socialNum.indexOf("-", dash1 + 1);

		sum += Integer.parseInt(socialNum.substring(0, dash1));
		sum += Integer.parseInt(socialNum.substring(dash1 + 1, dash2));
		sum += Integer.parseInt(socialNum.substring(dash2 + 1, socialNum.length()));
	}

	public String toString() {
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}