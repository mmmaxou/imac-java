package td5;

/**
 * @author mpluchar
 *
 */
public class Arena {

	/**
	 * 
	 */
	public Arena() {
		
	}
	
	public Robot fight(Robot r1, Robot r2) {
		boolean firstRobotTurn = true;
		Robot first, second;
		while(!r1.isDead() && !r2.isDead()) {
			// Select the fighter
			if(firstRobotTurn) {
				first = r1;
				second = r2;
			} else {
				first = r2;
				second = r1;
			}
			firstRobotTurn = !firstRobotTurn;
			try {
				first.fire(second);
			} catch (Exception e) {
				System.out.println("Combat terminé");
				break;
			}
		}
		Robot dead = r1.isDead() ? r2 : r1;
		return dead;
	}

}
