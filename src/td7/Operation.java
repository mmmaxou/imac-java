package td7;

import java.util.Scanner;

/**
 * @author mpluchar
 *
 */
public abstract class Operation implements Expr {

	private final Expr left;
	private final Expr right;
	
	/**
	 * @param left
	 * @param right
	 */
	public Operation(Expr left, Expr right) {
		this.left = left;
		this.right = right;
	}
	
	/**
	 * @return the left
	 */
	public Expr getLeft() {
		return left;
	}
	
	/**
	 * @return the right
	 */
	public Expr getRight() {
		return right;
	}
	
	/**
	 * @return the operation type
	 */	
	public abstract String getOperation();
	
	/**
	 * Parse
	 * @param scanner
	 * @return
	 */
	public static Operation parse(Scanner scanner) {
		return (Operation) Expr.parse(scanner);
	}

	/* (non-Javadoc)
	 * @see td7.Expr#displayTree()
	 */
	@Override
	public void displayTree() {
		System.out.print("(");
		left.displayTree();
		System.out.print(this.getOperation());
		right.displayTree();
		System.out.print(")");		
	}	
}
