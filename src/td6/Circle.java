package td6;

/**
 * @author mpluchar
 *
 */
public class Circle {
	private Point center;

	private double radius;
	
	public Circle(Point center, double radius) {
		this.center = new Point(center);
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}
	
	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + ", surface=" + this.surface() + "]";
	}
	
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}
	
	public double surface() {
		return Math.PI * this.radius * this.radius;
	}
	
	public boolean contains(Point p) {
		double d1 = p.getX() - this.getCenter().getX();
		double d2 = p.getY() - this.getCenter().getY();
		d1 = d1*d1;
		d2 = d2*d2;
		double distance = Math.sqrt(d1 + d2);
		return distance <= this.radius;
	}
}
