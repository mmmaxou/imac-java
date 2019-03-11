package td7;

import java.util.Objects;
import java.util.Scanner;

public class Value implements Expr {

	private final int value;

	/**
	 * @param value
	 */
	public Value(int value) {
		this.value = Objects.requireNonNull(value);
	}

	@Override
	public int eval() {
		return this.value;
	}
	
	/**
	 * Parse
	 * @param scanner
	 * @return
	 */
	public static Value parse(Scanner scanner) {
		return (Value) Expr.parse(scanner);
	}

	@Override
	public void displayTree() {
		System.out.print(this.eval());		
	}
}
