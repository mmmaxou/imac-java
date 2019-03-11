/**
 * 
 */
package td7;

/**
 * @author mpluchar
 *
 */
public class Add extends Operation {

	public Add(Expr left, Expr right) {
		super(left, right);
	}

	@Override
	public int eval() {
		return this.getLeft().eval() + this.getRight().eval();
	}

	@Override
	public String getOperation() {
		return "+";
	}
	
	
}
