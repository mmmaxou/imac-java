package td9;

import java.util.Objects;

/**
 * @author mpluchar
 *
 */
public class Link {
	private Object value;
	private Link next;
		
	/**
	 * @param value
	 */
	public Link(Object value) {
		this.value = Objects.requireNonNull(value);
		this.next = null;
	}
	
	/**
	 * @return true if there is a link after
	 */
	boolean hasNext() {
		return this.next != null;
	}
	
	/**
	 * @return the next
	 */
	public Link getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Link next) {
		this.next = next;
	}
	
	/**
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}

	public Link get(int depth, int level) {
		if(this.next == null) {
			throw new RuntimeException("Index out of reach at level : " + level + " and depth left is : " + depth);
		}
		if(depth == 0) {
			return this.next;
		} else {
			return this.next.get(depth - 1, level + 1);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str = this.value.toString() + " -> ";
		if (this.hasNext()) {
			return str + this.next.toString();
		}
		else {
			return str + "end";
		}
	}

	public boolean contains(Object o) {
		if (o.equals(this.value)) {
			return true;
		} else {
			if (this.hasNext()) {
				return this.next.contains(o);
			}
			return false;
		}
	}
	
	

	
	
}
