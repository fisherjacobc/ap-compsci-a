import java.util.ArrayList;
import java.util.List;

/**
 * @author Jacob Fisher
 * @created 25 Feb 2025
 */
public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> rowTotals = new ArrayList<Integer>();

      for (int[] row : m) {
        int sum = 0;
        for (int num : row) {
          sum += num;
        }
        rowTotals.add(sum);
      }

		  return rowTotals;
    }
}
