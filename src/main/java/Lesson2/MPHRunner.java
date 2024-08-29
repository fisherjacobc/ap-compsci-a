//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Scanner;

/**
 * @author Jacob Fisher
 * @created 29 Aug 2024
 */
public class MPHRunner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.print("Enter the distance :: ");
			int dist = keyboard.nextInt();

			System.out.print("Enter the hours :: ");
			int hrs = keyboard.nextInt();

			System.out.print("Enter the minutes :: ");
			int mins = keyboard.nextInt();

			MilesPerHour reference = new MilesPerHour();

			System.out.printf("%d miles in %d hour(s) and %d minute(s) = %.0f MPH.\n", dist, hrs, mins,
					reference.getMPH(dist, hrs, mins));
		}

		keyboard.close();
	}
}

/*
 * 
 * Sample Output :
 * Enter the distance :: 45
 * Enter the hours :: 0
 * Enter the minutes :: 32
 * 
 * 45 miles in 0 hour and 32 minutes = 84 MPH.
 * 
 * 
 * 
 * 
 * Enter the distance :: 96
 * Enter the hours :: 1
 * Enter the minutes :: 43
 * 
 * 96 miles in 1 hour and 43 minutes = 56 MPH.
 * 
 * 
 * 
 * 
 * Enter the distance :: 100
 * Enter the hours :: 2
 * Enter the minutes :: 25
 * 
 * 100 miles in 2 hour and 25 minutes = 41 MPH.
 * 
 * 
 * 
 * 
 * Enter the distance :: 50
 * Enter the hours :: 2
 * Enter the minutes :: 25
 * 
 * 50 miles in 2 hour and 25 minutes = 21 MPH.
 * 
 */