/**
 * 
 */
package td1;

// Cette ligne permet d'importer la classe Scanner
import java.util.Scanner;

/**
 * @author mpluchar
 *
 */
public class Calc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// nextInt est une methode de la classe scanner
		
		// Variable de type Scanner
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Donner moi un 1er entier");
		// Variable de type int
		int v1 = scanner.nextInt();
		
		System.out.println("Donner moi un 2e entier");
		// Variable de type int
		int v2 = scanner.nextInt();
		
		System.out.println("Somme : " + (v1+v2));
		System.out.println("Différence : " + (v1-v2));
		System.out.println("Produit : " + (v1*v2));
		System.out.println("Quotient : " + (v1/v2));
		System.out.println("Reste : " + (v1%v2));
		
		scanner.close();
	}

}
