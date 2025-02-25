/**
 * @author Jacob Fisher
 * @created 25 Feb 2025
 */
public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] test1 = {{1,2,3},{5,5,5,5}};
		int[][] test2 = {{1,2,3},{5},{1},{2,2}};
		int[][] test3 = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};

		System.out.println("Row totals are :: " + TotalRow.getRowTotals(test1));
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(test2));
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(test3));
	}
}



