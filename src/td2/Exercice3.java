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
		// java.util.regex.Pattern permet de représenter une expression régulière compilée
		// java.util.regex.Matcher permet de rechercer un motif dans un string
		
		for (String s : args) {
			System.out.print(s + " : ");
			System.out.println(Exercice3.isNumber(s));
		}
	}
	
	public static boolean isNumber(String s) {
		Pattern numberPattern = Pattern.compile("(\\d)");
		Matcher numberMatches = numberPattern.matcher(s);
		return numberMatches.find();		
	}

}
