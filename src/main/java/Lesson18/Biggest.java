/**
 * @author Jacob Fisher
 * @created 25 Feb 2025
 */
public class Biggest
{
    public static int getBig(int[][] m)
    {
		  int currentBiggest = Integer.MIN_VALUE;

      for (int[] row : m) {
        for (int num : row) {
          if (num > currentBiggest)
            currentBiggest = num;
        }
      }

      return currentBiggest;
    }
}
