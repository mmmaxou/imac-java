package td6;

public class Main {

	public static void main(String[] args) {
		// 6.
		// Il faut faire une copie du point
		var point = new Point(1, 2);
		var circle = new Circle(point, 1);
		circle.getCenter().translate(1,1);
		System.out.println(point);

		// 7. 
		// Il faut faire une copie du point

	}

}
