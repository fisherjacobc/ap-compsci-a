/**
 * @author Jacob Fisher
 * @created 25 Feb 2025
 */
public class Grid
{
   private char[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, char[] vals)
	{
		grid = new char[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				grid[i][j] = vals[(int)(Math.random() * (vals.length - 1))];
			}
		}
	}

	//find out which of the vals occurs the most
	public char findMax(char[] vals)
	{
		char max = ' ';
		int maxCount = 0;
		for (char val : vals) {
			int count = countVals(val);
			if (count > maxCount) {
				max = val;
				maxCount = count;
			}
			System.out.println(val + " count is " + count);
		}
		System.out.println(max + " occurs the most");
		return max;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals(char val)
	{
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == val) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output = "";

		for (char[] row : grid) {
			for (char val : row) {
				output += val + " ";
			}
			output += "\n";
		}

		return output;
	}
}