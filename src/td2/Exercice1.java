/**
 * 
 */
package td2;

/**
 * @author mpluchar
 *
 */
public class Exercice1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1 _
		var s = "toto";
		System.out.println(s.length());
		// Le type de <s> est String
		// Le compilateur utilise le systeme Just In Time pour utiliser des methodes a
		// la volée

		// 2 _
		var s1 = "toto";
		var s2 = s1;
		var s3 = new String(s1);

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		// == teste l'égalité de la référence, et pas du contenu
		// La String s2 est une référence à s1, elle est donc égale
		// La String s3 est une nouvelle chaine crée avec la valeur de s2, elle est donc
		// différente

		// 3 _
		var s4 = "toto";
		var s5 = new String(s4);

		System.out.println(s4.equals((s5)));

		// 4 _
		var s6 = "toto";
		var s7 = "toto";

		System.out.println(s6 == s7);
		// Le compilateur sait quand 2 strings sont pareilles, et pointent vers le meme
		// endroit, grace au systeme de String Pool

		// 5 _

		// Il faut qu'une String ne soit pas mutable, pour des raisons de sécurité, de
		// facilité d'utilisation des autres objets, pour les hashcode et pour la String
		// Pool

		// 6 _

		var s8 = "hello";
		s8.toUpperCase();
		System.out.println(s8);
		
		// La method toUpperCase renvoie une nouvelle chaine de caractere
		// Il faudrait faire var s9 = s8.toUpperCase

	}

}
