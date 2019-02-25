package td5;

/**
 * @author mpluchar
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot R2D2 = new Robot("R2D2");
		Robot data = new Robot("Data");
		System.out.println(R2D2);
		Arena arena = new Arena();
		System.out.println(arena.fight(R2D2, data) + " gagne.");
		
		Fighter john = new Fighter("John", 1);
		Fighter jane = new Fighter("Jane", 2);
		System.out.println(arena.fight(john, jane) + " gagne.");
		
		// 9.
		// Le sous-typage permet d'heriter des méthodes et champs d'une autre classe
		// Le polymorphisme permet de redéfinir une implémentation de méthode
	}

}
