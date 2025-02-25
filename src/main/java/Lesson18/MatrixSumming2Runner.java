import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Jacob Fisher
 * @created 25 Feb 2025
 */
public class MatrixSumming2Runner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("./src/main/java/Lesson18/matsum.dat"));
		MatrixSumming2 summing2 = new MatrixSumming2();
		
		int times = file.nextInt();
		file.nextLine();  //buffer clearing code

		for( int i=1; i<=times; i++ )
		{
			int row = file.nextInt();
			int column = file.nextInt();
			file.nextLine();  //buffer clearing code

			System.out.println("The sum of " + row + "," + column + " is " + summing2.sum(row, column));
		}

		file.close();
	}
}



