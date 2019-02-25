package td6;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + x + ',' + y + ')';
	}

	public void translate(int dx, int dy) {
		// 1.
		// x et y sont déclarés final et ne peuvent donc etre modifiés
		// On ne peut pas faire de translate du coup.
		x += dx;
		y += dy;
	}
}
