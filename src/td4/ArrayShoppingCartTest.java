/**
 * 
 */
package td4;

import td3.Book;

/**
 * @author mpluchar
 *
 */
public class ArrayShoppingCartTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1.
		ArrayShoppingCart arr = new ArrayShoppingCart(4);
		try {
			arr.add(new Book("20000 lieux sous les mers"));
			arr.add(new Book("Bilbo le Hobbit"));
			arr.add(new Book("Harry Potter"));
			arr.add(new Book("Divergente"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//arr.display();
		//System.out.println(arr.longestTitle());
		
		// 2.

		FreeShoppingCart cart = new FreeShoppingCart();
		Book hobbit = new Book("Bilbo le Hobbit");
		try {
			cart.add(new Book("20000 lieux sous les mers"));
			cart.add(hobbit);
			cart.add(new Book("Harry Potter"));
			cart.add(new Book("Divergente"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cart.display();
		cart.removeFirstOccurence(hobbit);
		cart.display();
		System.out.println(cart.longestTitle());
	}

}
