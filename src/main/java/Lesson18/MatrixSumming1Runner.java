import java.util.Arrays;

/**
 * @author Jacob Fisher
 * @created 25 Feb 2025
 */
public class MatrixSumming1Runner
{
	public static void main( String args[] ) throws Exception
	{
		System.out.println("Matrix Values");
		for (int[] row : MatrixSumming1.m) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println("The sum is :: " + MatrixSumming1.sum());
	}
}



