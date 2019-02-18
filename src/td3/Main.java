package td3;

import java.util.ArrayList;

/**
 * @author mpluchar
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 2.
		// 7.
		Book book = new Book("Le Hobbit", "J.R.Tolkien");
		System.out.println(book.getTitle() + " de " + book.getAuthor());
		// Ce code renvoi 'null null' car les attributs title et author n'ont pas été initialisés

		// 3.
		// Les attributs title et author sont privés, il faut des getter

		// 4.
		// private : Accessible à la classe seulement
		// (Défault) : Accessible au package seulement
		// protected : Accessible pour le package et ses sous-classes
		// public : Accessible partout

		// 10.
		// Le compilateur appelle automatique le bon constructeur en fonction du nombre et du type des paramètres		

		var b1 = new Book("Da Java Code", "Duke Brown");
		var b2 = b1;
		var b3 = new Book("Da Java Code", "Duke Brown");

		System.out.println(b1 == b2);
		System.out.println(b1 == b3);
		
		// 1.
		// Affiche : 
		// true
		// false
		// '==' teste la référence et pas le contenu. b1 et b3 ont été construit différement
		
		System.out.println(b1.equals(b2));
		
		// Index of : Renvoi la 1e occurence d'un élément spécifié dans la liste ou -1 si il ne trouve pas
		
		var list = new ArrayList();
		list.add(b1);
		System.out.println(list.indexOf(b2));
		System.out.println(list.indexOf(b3));
		
		// 5.
		// IndexOf appelle equals
		
		// 9.
		/*
		var aBook = new Book(null, null);
		var anotherBook = new Book(null, null);
		var list1 = new ArrayList();
		list1.add(aBook);
		System.out.println(list1.indexOf(anotherBook));
		*/
		
		// On reçoit une erreur NUllPointerException
		// C'est bien car on peut la corriger
		
		// 10.
		// On utilise assert
		
		// Ex 3
		System.out.println(book);
		System.out.println(b1);
	      
	}

}
