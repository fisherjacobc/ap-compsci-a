//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 29 Aug 2024
 */
public class MilesPerHour {
	public double getMPH(int dist, int hrs, int mins) {
		double totalHrs = hrs + mins / 60.0;

		return dist / totalHrs;
	}
}
