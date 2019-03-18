package td9;

/**
 * @author mpluchar
 *
 */
public class LinkedLink<T> {
	private Link first;

	public LinkedLink() {
		first = null;
	}

	/**
	 * Add an element to head of the list
	 * @param value
	 */
	public void add(T value) {
		Link l = new Link(value);
		l.setNext(this.first);
		this.first = l;
	}
	
	public Link get(int depth) {
		if(this.first == null) {
			throw new RuntimeException("Index out of reach at level : 0 and depth left is : " + depth);
		}
		if(depth == 0) {
			return this.first;
		} else {
			return this.first.get(depth - 1, 1);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str = "Link : ";
		if (this.first != null) {
			return str + this.first.toString();	
		} else {
			return str + "end";
		}
	}
	
	public boolean contains(Object o) {
		if (this.first == null) {
			return false;
		}
		else {
			return this.first.contains(o);
		}
	}

}
