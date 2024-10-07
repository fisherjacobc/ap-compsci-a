//(c) A+ Computer Science
// www.apluscompsci.com

//bare bones class example

import java.util.Scanner;

public class TweetRunner
{
   public static void main(String args[])
	{
		Tweet sample = new Tweet( "aplus", 0, 0 );
		sample.addLikes( 3 );
		sample.addRetweets( 28 );
		System.out.println( sample.notLiked() );  
			  
		//add more test code
	}
}











/*
Scanner kb = new Scanner( System.in );

System.out.print("Enter an integer: ");
int a = kb.nextInt();         
System.out.println("int read in was " + a);
System.out.println();

System.out.print("Enter a double: ");
double d = kb.nextDouble();  // reads a double from keyboard
System.out.println("double read in was " +d);  
System.out.println();     

System.out.print("Enter a word: ");
String s = kb.next();       
System.out.println("String read in was " + s);
System.out.println();

*/