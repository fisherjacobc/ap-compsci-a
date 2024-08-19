//(c) A+ Computer Science
//www.apluscompsci.com

//scanner file example

import java.util.*;
import java.io.*;

public class File_input
{
	public static void main(String args[]) throws Exception
	{
		Scanner in;
		//in = new Scanner( System.in );   //keyboard input
		in = new Scanner( new File( "it.dat" ) );  //file input
		
		int sum = in.nextInt();
		sum = sum + in.nextInt();
		sum = sum + in.nextInt();
		System.out.println( sum );
	}
}
