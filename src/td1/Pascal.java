package td1;

/**
 * @author mpluchar
 *
 */
public class Pascal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Programme en C :
		// Le temps donné par time a.out est de :
		// real : 0m1,047s
		// user : 0m1,045s
		// sys :  0m0,000s

		// Programme en Java :
		// Le temps donné par time a.out est de :
		// real : 0m0,273s
		// user : 0m0,292s
		// sys :  0m0,012s

		// Le programme en Java est plus rapide
		// La différence de vitesse est due au système de JUST IN TIME de Java

		System.out.println(" Cn, p = " + Pascal.pascal(30000, 250));
	}

	public static int pascal(int nBut, int pBut) {
		int[] tab = new int[nBut + 1];
		int n, i;

		tab[0] = 1;

		for (n = 1; n <= nBut; n++) {
			tab[n] = 1;

			for (i = n - 1; i > 0; i--)
				tab[i] = tab[i - 1] + tab[i];
		}

		int result = tab[pBut];
		return result;
	}

}
