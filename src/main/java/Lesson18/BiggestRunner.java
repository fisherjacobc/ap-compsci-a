/**
 * @author Jacob Fisher
 * @created 25 Feb 2025
 */
public class BiggestRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] f = {{1,2,3},{5,5,5,5}};
		System.out.println( "The biggest number is :: " + Biggest.getBig(f));
		
		int[][] g = {{1,2,3},{-5},{11},{21,2}};
		System.out.println( "The biggest number is :: " + Biggest.getBig(g));
		
		int[][] h = {{1,2},{-5,5},{5,5},{4,5,6,7},{123124,12312}};
		System.out.println( "The biggest number is :: " + Biggest.getBig(h));
		
		int[][] i = {{-20, -40},{-234,-234234 }};
		System.out.println( "The biggest number is :: " + Biggest.getBig(i));
	}
}



