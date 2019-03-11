package td8;

public class Pear extends Fruit {
	public final int juiceFactor;

	/**
	 * @param juiceFactor
	 */
	public Pear(int juiceFactor) {
		assert juiceFactor >= 0 && juiceFactor <= 9 : "JuiceFactor must be between 0 and 9"; 
		this.juiceFactor = juiceFactor;
		this.setQuantity(1);
	}

	@Override
	public int price() {
		return this.juiceFactor * 3;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pear [juiceFactor=" + juiceFactor + "]";
	}
	
}
