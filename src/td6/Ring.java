package td6;

/**
 * @author mpluchar
 *
 */
public class Ring extends Circle {
	
	private double inRadius;

	/**
	 * @param center
	 * @param radius
	 */
	public Ring(Point center, double radius) {
		super(center, radius);		
	}

	/**
	 * @param center
	 * @param radius
	 * @param inRadius
	 * @throws Exception 
	 */
	public Ring(Point center, double radius, double inRadius) throws Exception {
		this(center, radius);
		if (inRadius >= radius) {
			throw new Exception("inRadius must be smaller than radius.");
		}
		this.inRadius = inRadius;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " & InternalRadius : " + this.inRadius;
	}

	/* (non-Javadoc)
	 * @see td6.Circle#surface()
	 */
	@Override
	public double surface() {
		final double inSurface = Math.PI * this.inRadius * this.inRadius;
		return super.surface() - inSurface;
	}

	/* (non-Javadoc)
	 * @see td6.Circle#contains(td6.Point)
	 */
	@Override
	public boolean contains(Point p) {

		double d1 = p.getX() - this.getCenter().getX();
		double d2 = p.getY() - this.getCenter().getY();
		d1 = d1*d1;
		d2 = d2*d2;
		double distance = Math.sqrt(d1 + d2);
		
		return super.contains(p) && distance >= this.inRadius;
	}
	
	static boolean contains(Point p, Ring... rings) {
		boolean isInside = false;
		for(Ring r : rings) {
			if (r.contains(p))
				isInside = true;
		}		
		return isInside;
	}
	
	
	
	

}
