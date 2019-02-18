/**
 * 
 */
package td1;

/**
 * @author mpluchar
 *
 */
public class PrintArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(args[0]);
		
		// Q1 Si l'on ne donne pas d'arguments, le programme plante
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		for(String s : args) {
			System.out.println(s);			
		}
	}

}
