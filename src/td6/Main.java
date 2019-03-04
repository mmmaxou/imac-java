package td6;

public class Main {

	public static void main(String[] args) {
		// 6.
		// Il faut faire une copie du point
		/*
		var point = new Point(1, 2);
		var circle = new Circle(point, 1);
		circle.getCenter().translate(1,1);
		System.out.println(point);
		 */

		// 7. 
		// Il faut faire une copie du point

		// Ex2.
		// 1.
		// Il faut faire de l'héritage lorsque l'on souhaite spécifier une classe.

		Point point = new Point(1, 2);
		Circle circle = new Circle(point, 2);
		System.out.println(circle);
		Ring ring;
		try {
			ring = new Ring(point, 2, 1);
			System.out.println(ring);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 4.
		// La méthode surface est fausse


	}

}
