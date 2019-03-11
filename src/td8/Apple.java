/**
 * 
 */
package td8;

import java.util.Objects;

/**
 * @author mpluchar
 *
 */

enum AppleKind {
    Golden, PinkLady, GrannySmith;
  }

public class Apple extends Fruit{
	private final int weight;
	private final AppleKind kind;
	
	/**
	 * 
	 * @param w
	 * @param n
	 */
	public Apple(int w, AppleKind kind) {
		this.weight = Objects.requireNonNull(w);
		this.kind = kind;
		this.setQuantity(1);
	}
	
	/**
	 * Return the price
	 * @return int
	 */
	public int price() {
		return this.weight / 2;
	}
	
	private String getName() {
		String name = null;
		switch (kind) {
		case Golden:
			name = "Golden";
			break;
		case PinkLady:
			name = "Pink Lady";
			break;
		case GrannySmith:
			name = "Granny Smith";
			break;
		}
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getName() + " " + weight;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + weight;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (getName() == null) {
			if (other.getName() != null)
				return false;
		} else if (!getName().equals(other.getName()))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
	
	
	
}
