//(c) A+ Computer Science
// www.apluscompsci.com

//print/println example
//escape sequence example

public class Escape2
{
	public static void main(String args[])
	{
		System.out.println("aplus\\compsci\"/");
		System.out.println("aplus\\'comp\'sci\'");
			
		System.out.println("aplusc\tompsci");
		System.out.println("apluscom\tpsci");
		System.out.println("a\bpluscomp\bsci");
		System.out.println("aplus\rcompsci");		
		
		System.out.printf("%s","apluscompsci\n");	
		System.out.printf("%.2f\n",9.23467);						
	}
}