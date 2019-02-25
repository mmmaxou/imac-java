package td5;

/**
 * @author mpluchar
 *
 */
public class Robot {

	
	String name;
	int life;
	/**
	 * 
	 */
	public Robot(String name) {
		this.name = name;
		this.life = 10;
	}
	@Override
	public String toString() {
		return "Robot " + this.name + "(" + this.life + ")";
	}
	
	public void fire(Robot opponent) throws Exception {
		if(opponent.isDead()) {
			throw new Exception("Code de déontologie des robots :)");
		}
		opponent.life -= 2;
		System.out.println(opponent + " à été touché par le " + this);
	}
	public boolean isDead() {
		return this.life <= 0;
	}
	
	
}
