/**
 * @author Jacob Fisher
 * @created 25 Feb 2025
 */
public class GridRunner
{
	public static void main( String args[] )
	{
		Grid test = new Grid(20, 20, new char[]{'a', 'b', 'c', 'x', '2', '7', '9'});
		System.out.println(test);
		System.out.println("The most common letter in this grid is " + test.findMax(new char[]{'a', 'b', 'c'}));
	}
}