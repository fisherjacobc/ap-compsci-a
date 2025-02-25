/**
 * @author Jacob Fisher
 * @created 25 Feb 2025
 */
public class MatrixSumming1
{
    public static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int sum()
    {
		int count = 0;
		for (int[] row : m) {
			for (int num : row) {
				count += num;
			}
		}
		return count;
    }
}
