//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 20 Sep 2024
 */
public class First {
	public static boolean repeats(String a) {
		if (a.length() <= 1)
			return false;
		if (a.substring(1).indexOf(a.charAt(0)) == -1)
			return false;
		return true;
	}

	public static String go(String a) {
		if (repeats(a))
			return "yes";
		return "no";
	}
}

/*
 * 
 * EXPECTED RUNNER OUTPUT
 * 
 * no
 * yes
 * no
 * no
 * yes
 * no
 * yes
 * yes
 * no
 * no
 * 
 * 
 */