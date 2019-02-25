package td4;

import java.util.ArrayList;
import java.util.Iterator;

import td3.Book;

/**
 * @author mpluchar
 *
 */
@SuppressWarnings("unused")
public class FreeShoppingCart {

	// 1.
	// Il faut ajouter le spécificateur de template <Book>
	ArrayList<Book> books;
	public FreeShoppingCart() {
		super();
		this.books = new ArrayList<Book>();
	}

	public void add(Book b) {
		this.books.add(b);
	}

	public void display() {
		System.out.println("Un caddie possédant : " + this.books.size() + " livres.");
		for(int i=0; i<this.books.size(); i++ ) {
			System.out.println(" > " + this.books.get(i));
		}
		System.out.println("Fin du caddie.");
	}
	public Book longestTitle() {
		
		int longest = 0;
		Book b = null;
		// 2.
		/*
		for (int i=0; i<this.books.size(); i++) {
			if (this.books.get(i).getTitle().length() > longest) {
				longest = this.books.get(i).getTitle().length();
				b = this.books.get(i);
			}
		}
		 */
		
		// 3.
		/*
		Iterator<Book> it = this.books.iterator();
		while(it.hasNext()) {
			Book tmp = it.next();
			if (tmp.getTitle().length() > longest) {
				longest = tmp.getTitle().length();
				b = tmp;
			}
		}
		*/
		
		// 4.
		for(Book tmp : this.books) {
			if (tmp.getTitle().length() > longest) {
				longest = tmp.getTitle().length();
				b = tmp;
			}
		}
		return longest != 0 ? b : null;
	}
	
	public void removeFirstOccurence(Book b) {
		// 5.
		// Complexité en O(n)
		this.books.remove(b);
		
		// 7.
		// On utilise un itérateur quand on ne sait pas ou se trouve l'élément que l'on souhaite atteindre
	}
}
