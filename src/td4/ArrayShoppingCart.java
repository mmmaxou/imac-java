package td4;

import td3.Book;

/**
 * @author mpluchar
 *
 */
public class ArrayShoppingCart {
	
	
	private Book[] book;
	private int amount;
	final private int max;
	// 1.
	// Il n'est pas intéressant de stocker le nombre maximum de livre dans une variable statique, puisque ce nombre dépend de chaque
	// instance de classe.

	public ArrayShoppingCart(int max) {
		super();
		this.book = new Book[max];
		this.amount = 0;
		this.max = max;
	}
	
	public void add(Book b) throws Exception {
		if(this.amount >= this.max) {
			throw new Exception("Array is already full");
		}
		this.book[amount++] = b;
	}
	
	public void display() {
		System.out.println("Un caddie possédant : " + this.amount + " livres.");
		for(int i=0; i<this.amount; i++ ) {
			System.out.println(" > " + this.book[i]);
		}
		System.out.println("Fin du caddie.");
	}
	
	public Book longestTitle() {
		int longest = 0;
		Book b = null;
		for (int i=0; i<this.amount; i++) {
			if (this.book[i].getTitle().length() > longest) {
				longest = this.book[i].getTitle().length();
				b = this.book[i];
			}
		}
		return longest != 0 ? b : null;
	}

}
