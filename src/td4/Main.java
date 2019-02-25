package td4;

/**
 * @author mpluchar
 *
 */
// 5.
// On peut rapidement refactor
public class Main {
	
	// 9.
	// Ctrl+Shift+G recherche toutes les instances de foo et tous les endroits où il apparait dans le code.
	int foo;

	// 3.
	public int getFoo() {
		return foo;
	}

	// 3.
	public void setFoo(int foo) {
		this.foo = foo;
	}

	// 4
	// Generate Constructor using field "foo"
	public Main(int foo) {
		super();
		this.foo = foo;
	}

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unused", "deprecation" })
	public static void main(String[] args) {
		System.out.println("Hello World");
		//1. System.out.println();
		//2. ToStream
		
		// 6.
		int i = 2 + 3;
		int a = i + 4;
		
		// 7.
		@SuppressWarnings("unused")
		Integer integer = new Integer(2);
		
		// 8.
		// Appuyer sur string en maintenant Ctrl ouvre la déclaration de String
		String s;
		
		// 11.
		// Ctrl+Shift+0 sert a passert en insert mode

	}

}
