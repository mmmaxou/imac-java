package td5;

import java.util.Random;

/**
 * @author mpluchar
 *
 */
public class Fighter extends Robot {

	Random gen;
	/**
	 * @param name
	 */
	public Fighter(String name, int seed) {
		// 1.
		// Un générateur de nombre aléatoire crée une suite de nombre qui semble aléatoire
		// Il utilise une graine de telle sorte que l'on puisse avoir toujours la même séquence en fonction de la graine donnée
		super(name);
		this.gen = new Random(seed);
	}

	@Override
	public String toString() {
		return "Fighter " + this.name + "(" + this.life + ")";
	}

	@Override
	public void fire(Robot opponent) throws Exception {
		if(gen.nextBoolean())
			super.fire(opponent);
		else
			System.out.println(this + " à raté sa cible.");
	}
	
	
	

}
