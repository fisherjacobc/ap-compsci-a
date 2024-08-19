//(c) A+ Computer Science
// www.apluscompsci.com

//error examples

//class name is wrong - should be Errors not Error
public class Error
{
	public static void main(String args[])
	{
		//Compile Errors

		//missing semicolon
		System.out.println("aplus cs")

		//case problem – should be System
		system.out.println("aplus cs");

		//Runtime Errors

		//out of bounds exception is thrown
		String s = "runtime_error";
		System.out.println( s.charAt(15) );
	//missing brace
}