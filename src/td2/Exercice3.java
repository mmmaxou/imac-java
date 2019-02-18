/**
 * 
 */
package td2;

import java.util.regex.*;

/**
 * @author mpluchar
 *
 */
public class Exercice3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// java.util.regex.Pattern permet de représenter une expression régulière
		// compilée
		// java.util.regex.Matcher permet de rechercer un motif dans un string

		System.out.println("Numbers : ");
		for (String s : args) {
			System.out.print(s + " : ");
			System.out.println(Exercice3.isNumber(s));
		}

		System.out.println();
		System.out.println("Number at the end of the string : ");
		for (String s : args) {
			System.out.print(s + " : ");
			System.out.println(Exercice3.containNumber(s));
		}

		System.out.println();
		System.out.println("Is an IPv4");
		for (String s : args) {
			System.out.print(s + " : ");
			System.out.println(Exercice3.isIP(s));
		}
	}

	public static boolean isNumber(String s) {
		Pattern numberPattern = Pattern.compile("(\\D)");
		Matcher numberMatches = numberPattern.matcher(s);
		return !numberMatches.find();
	}

	public static boolean containNumber(String s) {
		Pattern pattern = Pattern.compile("\\d+$");
		Matcher matches = pattern.matcher(s);
		return matches.find();
	}

	public static boolean isIP(String s) {
		Pattern pattern = Pattern.compile("^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$");
		Matcher matches = pattern.matcher(s);
		boolean b = matches.matches();
		if (!b) {
			return false;
		}
		boolean isOctet = true;
		for(int i=1; i <= matches.groupCount(); i++) {
			if (Integer.parseInt(matches.group(i)) > 255) {
				isOctet = false;
			}
	        //System.out.println("Group " + i + " : " + matches.group(i));
		}
		return isOctet;
	}

}
