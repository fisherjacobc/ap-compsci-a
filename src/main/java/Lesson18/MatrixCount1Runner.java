import java.util.Arrays;

/**
 * @author Jacob Fisher
 * @created 25 Feb 2025
 */
public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		System.out.println("Matrix Values");
		for (int[] row : MatrixSumming1.m) {
			System.out.println(Arrays.toString(row));
		}
		int val1 = (int) (Math.random() * 5);
		int val2 = (int) (Math.random() * 10);
		int val3 = (int) (Math.random() * 15);
		int val4 = (int) (Math.random() * 20);

		System.out.println("The " + val1 + " count is :: " + MatrixCount1.count(val1));
		System.out.println("The " + val2 + " count is :: " + MatrixCount1.count(val2));
		System.out.println("The " + val3 + " count is :: " + MatrixCount1.count(val3));
		System.out.println("The " + val4 + " count is :: " + MatrixCount1.count(val4));
	}
}



