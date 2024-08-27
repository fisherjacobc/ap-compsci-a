//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

/**
 * @author Jacob Fisher
 * @created 27 Aug 2024
 */
public class FahrenheitRunner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < 5; i++)
			calculateCelsius(kb);
	}

	public static void calculateCelsius(final Scanner input) {
		System.out.print("Enter the fahrenheit value :: ");
		double fahrenheit = input.nextDouble();

		double celsius = (fahrenheit - 32) * 5 / 9;

		System.out.printf("%.2f degrees Celsius\n", celsius);
	}
}

/*
 * 
 * Sample Data:
 * 98.6
 * 52.30
 * 82.45
 * 75.00
 * 100.00
 * 
 * Sample Output :
 * 37.00 degrees Celsius
 * 11.28 degrees Celsius
 * 28.03 degrees Celsius
 * 23.89 degrees Celsius
 * 37.78 degrees Celsius
 * 
 * 
 */
