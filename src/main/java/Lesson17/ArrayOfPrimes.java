//� A+ Computer Science  -  www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 13 Mar 2025
 */
public class ArrayOfPrimes
{
	//instance variables and constructors could be present, but are not necessary
	
	//getPrimeList(int numPrimes) will return an array 
	//containing the first numPrimes primes starting at 2
	public static int[] getPrimeList(int numPrimes)
	{
		return getPrimeList(numPrimes, 2);
	}

	//getPrimeList(int numPrimes, int primeStart) will return an array 
	//containing the first numPrimes primes starting at primeStart
	public static int[] getPrimeList(int numPrimes, int primeStart)
	{
		int[] primes = new int[numPrimes];
		int i = 0;

		int j = primeStart;
		do {
			if (isPrime(j)) {
				primes[i] = j;
				i++;
			}

			j++;
		} while (i != numPrimes);


		return primes;
	}
		
	//isPrime will return true if num is prime
	//a prime number is any number ony divisible by 1 and itself
	private static boolean isPrime(int num)
	{
		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;
		return true;
	}
}