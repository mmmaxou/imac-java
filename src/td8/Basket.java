/**
 * 
 */
package td8;

import java.util.ArrayList;

/**
 * @author mpluchar
 *
 */
public class Basket {
	private final ArrayList<Fruit> fruits;

	/**
	 * 
	 */
	public Basket() {
		this.fruits = new ArrayList<Fruit>();
	}
	
	/**
	 * Add a fruit
	 * @param f
	 */
	public void add(Fruit f) {
		this.fruits.add(f);
	}
	
	/**
	 * Add multiple fruits
	 * @param f
	 * @param n
	 */
	public void add(Fruit f, int n) {
		assert n > 1 : "Can't add negative or null amount of fruits";
		f.setQuantity(n);
		this.fruits.add(f);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		int total = 0;
		for(Fruit fruit : fruits) {
			str.append(fruit.toString());
			str.append(" x ");
			str.append(fruit.getQuantity());
			str.append("\n");
			total += fruit.price() * fruit.getQuantity();
		}
		str.append("price : " + total);
		return str.toString();
	}
	
}
