package td7;

import java.util.Scanner;

/**
 * @author mpluchar
 *
 */
public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		OpOrValue expression;
		try {
			expression = new OpOrValue(OP_ADD,
					new OpOrValue(2),
					new OpOrValue(3)
					);
			System.out.println(expression.eval());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

		// 1.
		// Il est déclaré private car on ne souhaite pas qu'il soit appellé par l'utilisateur

		Node<OpOrValue> root = null;
		root = OpOrValue.parse(new Scanner(System.in), root);
		System.out.println("Root value : " + root.getData().eval());
		printTree(root);

		System.out.println("end");
	}
	
	private static void printTree(Node<OpOrValue> node) {
	 
		if (node.getData().isOperation()) {
			System.out.print("(");
			printTree(node.getChildren().get(0));
			System.out.print(node.getData().getOperator());
			printTree(node.getChildren().get(1));
			System.out.print(")");
		} else {
			System.out.print(node.getData().eval() + " = ");
			node.getChildren().forEach(each -> printTree(each));
		}
	 }

}
