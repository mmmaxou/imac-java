package td7;

import java.util.List;
import java.util.Scanner;

public class OpOrValue {
	public static final int OP_NONE = 0;
	public static final int OP_ADD = 1;
	public static final int OP_SUB = 2;

	private final int operator;
	private final int value;
	private final OpOrValue left;
	private final OpOrValue right;

	private OpOrValue(int operator, int value, OpOrValue left, OpOrValue right) {
		this.operator = operator;
		this.value = value;
		this.left = left;
		this.right = right;
	}
	public OpOrValue(int value) {
		this(OP_NONE, value, null, null);
	}
	public OpOrValue(int operator, OpOrValue left, OpOrValue right) throws Exception {
		// a bug lies here
		this(operator, 0, left, right);
		if (operator < OP_NONE || operator > OP_SUB) {
			throw new Exception("Invalid operator, must be one of : OP_NONE, OP_ADD, OP_SUB");
		}
	}

	public int eval() {
		switch(operator) {
		case OP_ADD:
			return left.eval() + right.eval();
		case OP_SUB:
			return left.eval() - right.eval();
		default: // case OP_NONE:
			return value;
		}
	}
	
	public boolean isOperation() {
		return this.operator != OP_NONE;
	}
	
	public String getOperator() {
		if (this.operator == OP_NONE) return "null";
		else if (this.operator == OP_ADD) return "+";
		else return "-";
	}

	public static Node<OpOrValue> parse(Scanner scanner, Node<OpOrValue> node) {
		boolean shallContinue = true;
		while(shallContinue) { 
			// Get word
			System.out.print("Enter a word : ");
			String word = scanner.next();

			// Parse it
			try {
				int value = Integer.parseInt(word);

				// It's an integer
				if(node == null) {
					node = new Node<OpOrValue>(new OpOrValue(value));
				} else {
					node.addChild(new Node<OpOrValue>(new OpOrValue(value)));
				}
				return node;

			} catch (NumberFormatException | NullPointerException nfe) {
				// It's a String
				int operation;
				switch (word) {
				case "+": 
					operation = OP_ADD;
					break;
				case "-": 
					operation = OP_SUB;
					break;
				default:
					shallContinue = false;
					System.out.println("Leaving");
					return node;
				}
				if (node == null ) {
					node = new Node<OpOrValue>(new OpOrValue(0));
				}
				parse(scanner, node);
				parse(scanner, node);
				List<Node<OpOrValue>> children = node.getChildren();
				OpOrValue left = children.get(0).getData();
				OpOrValue right = children.get(1).getData();
				OpOrValue expression = null;
				try {
					expression = new OpOrValue(operation, left, right);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				node.setData(new OpOrValue(expression.eval()));
				return node;
			}
		}
		return node;
	}
}
