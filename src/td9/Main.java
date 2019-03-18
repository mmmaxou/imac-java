package td9;

/**
 * @author mpluchar
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Exercice 1
		// 1.
		/*
		Link l1 = new Link(13); 
		Link l2 = new Link(144);
		*/
		
		// 2.
		// Il faut utiliser la commande javac pour compiler puis java pour executer
		LinkedLink<Integer> linked = new LinkedLink<>();
		linked.add(13);
		linked.add(144);
		linked.add(255);
		System.out.println(linked);

		
		// Exercice 2
		// 1.
		System.out.println(linked.get(2));
		// System.out.println(linked.get(4));
		
		// 3.
		LinkedLink<String> linkString = new LinkedLink<>();
		linkString.add("chat");
		linkString.add("Un");
		System.out.println(linkString);
		System.out.println("Taille du 2e élément : " + ((String) linkString.get(1).getValue()).length());
		// 4.
		// Un cast peut aboutir à une erreur de type
		
		// Exercice 3
		// 1.
		// Un type paramètrique permet de rendre plus polyvalent une implémentation
		// Cela permet également de forcer 1 seul type dans la chaîne
		// Afin d'éviter d'avoir une chaîne contenant des ints et des strings par exemple
		System.out.println("linkString contient chat ? : " + linkString.contains("chat"));
		System.out.println("linkString contient chien ? : " + linkString.contains("chien"));
	}

}
