/**
 * 
 */
package td7;

/**
 * @author mpluchar
 *
 */
public class Sub extends Operation {

	public Sub(Expr left, Expr right) {
		super(left, right);
	}

	@Override
	public int eval() {
		return this.getLeft().eval() - this.getRight().eval();
	}

	@Override
	public String getOperation() {
		return "-";
	}

}
