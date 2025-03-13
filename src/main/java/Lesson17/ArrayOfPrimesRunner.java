//� A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;
import java.util.Arrays;

/**
 * @author Jacob Fisher
 * @created 13 Mar 2025
 */
public class ArrayOfPrimesRunner
{
	public static void main( String args[] )
	{
	   out.println("The 1st 5 primes starting from 2 are :: \n"+Arrays.toString(ArrayOfPrimes.getPrimeList(5)));   
	   
	   //add more test cases   
	   out.println("The 1st 5 primes starting from 10 are :: \n"+Arrays.toString(ArrayOfPrimes.getPrimeList(5, 10)));

	   out.println("The 1st 10 primes starting from 100 are :: \n"+Arrays.toString(ArrayOfPrimes.getPrimeList(10, 100)));
	}
}