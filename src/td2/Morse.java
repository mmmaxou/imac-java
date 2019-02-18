/**
 * 
 */
package td2;

/**
 * @author mpluchar
 *
 */
public class Morse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (String s : args) {
			System.out.print(s + " Stop. ");
		}
		System.out.println();
		
		// Un StringBuild est une chaine de caractere mutable
		// Sa méthode append renvoie un object de type stringBuilder pour pouvoir les enchainer
		
		StringBuilder out = new StringBuilder();
		for (String s : args) {
			out = out.append(s);
			out = out.append(" Stop. ");
		}
		System.out.println(out);
		
		// En utilisant javap, on remarque que append est plus optimisé que +
	}

}
