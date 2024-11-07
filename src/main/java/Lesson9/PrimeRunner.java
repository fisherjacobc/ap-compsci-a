//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 4 Nov 2024
 */
public class PrimeRunner {
	public static void main(String[] args) {
		System.out.println("24 is" + (Prime.isPrime(24) ? "" : " not") + " prime.");
		System.out.println("7 is" + (Prime.isPrime(7) ? "" : " not") + " prime.");
		System.out.println("100 is" + (Prime.isPrime(100) ? "" : " not") + " prime.");
		System.out.println("113 is" + (Prime.isPrime(113) ? "" : " not") + " prime.");
		System.out.println("65535 is" + (Prime.isPrime(65535) ? "" : " not") + " prime.");
		System.out.println("2 is" + (Prime.isPrime(2) ? "" : " not") + " prime.");
		System.out.println("7334 is" + (Prime.isPrime(7334) ? "" : " not") + " prime.");
		System.out.println("7919 is" + (Prime.isPrime(7919) ? "" : " not") + " prime.");
		System.out.println("1115125003 is" + (Prime.isPrime(1115125003) ? "" : " not") + " prime.");
	}
}