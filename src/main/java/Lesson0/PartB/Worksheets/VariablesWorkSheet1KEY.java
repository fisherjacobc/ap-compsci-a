//(c) A+ Computer Science
//www.apluscompsci.com

//variables worksheet key  

import static java.lang.System.*;

public class VariablesWorkSheet1KEY
{
	public static void main(String[] args)
	{

      int x = 128;	out.println(x);	//line1 
		
		x = -98;		out.println(x);	//line2	
		
		byte b = 24;	out.println(b);	//line3	
		
		char c = 97; 	out.println(c);	//line4	
		
		double d = 9.9;	out.println(d);	//line5	      
		
		d = 5.2;	      out.println(d);	//line6	
		
		float f = 9.87f;	out.println(f);	//line7	
		
		short s = 350;	out.println(s);	//line8	
		
		int z = 'A'+5;	out.println(z);	//line9	
		
		c = 'A'+5;		out.println(c);	//line10	
	
		double w = 'a'+5;  out.println(w);	//line11	
		
		long u = 'A'-48;	out.println(u);	//line12	
		
		w = f+5;		out.println(w);	//line13	
		
		b = (byte)x;	out.println(b);	//line14	
		
		w = 'A' * 2.0;	out.println(w);	//line15	
		
//		f=w;			out.println(f);	//line16				//ERROR
		out.println("ERROR");
		
		u=982743L;		out.println(u);	//line17	
		
		d = 3.2e2;		out.println(d);	//line18	
		
//		s=c;			out.println(s);	//line19				//ERROR
		out.println("ERROR");
//		z = w;		out.println(z);	//line20				//ERROR
		out.println("ERROR");
	}
}