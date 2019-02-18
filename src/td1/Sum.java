/**
 * 
 */
package td1;

/**
 * @author mpluchar
 *
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] integers = Sum.toTabInt(args);
		System.out.println("Sum : " + Sum.sum(integers));

	}
	
	public static int[] toTabInt(String[] t) {
		int[] integers = new int[t.length];
		
		
		// Une méthode statique est une méthode qui peut etre appellée sans initialiser d'instance de la classe
		System.out.print("Integers : ");
		for(int i=0; i<integers.length; i++) {
			integers[i] = java.lang.Integer.parseInt(t[i]);
			System.out.print(integers[i]+ " ");
		}

		System.out.println();
		return integers;
	}

	public static int sum(int[] t) {
		int sum = 0;
		
		for(int i=0; i<t.length; i++) {
			sum += t[i];
		}
		
		return sum;
	}
}
