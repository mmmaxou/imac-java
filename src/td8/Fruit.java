/**
 * 
 */
package td8;

/**
 * @author mpluchar
 *
 */
public abstract class Fruit {
	private int quantity;
	public abstract int price();
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
	
