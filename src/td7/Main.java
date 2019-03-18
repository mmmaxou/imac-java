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

		/*
		Node<OpOrValue> root = null;
		root = OpOrValue.parse(new Scanner(System.in), root);
		System.out.println("Root value : " + root.getData().eval());
		printTree(root);

		System.out.println("end");
		*/
		
		// Exercice 2
		// 1.
		// Nouveau main :
		Scanner scanner = new Scanner(System.in);
		Value e = Value.parse(scanner);
		System.out.println("e:" + e.eval());
		Operation o = Operation.parse(scanner);
		System.out.println("o:" + o.eval());
		System.out.println("Tree for e :");
		e.displayTree();
		System.out.println("Tree for o :");
		o.displayTree();
	}
	
	@SuppressWarnings("unused")
	private static void printTree(Node<OpOrValue> node) {
		
		System.out.println(node.getData().getOperator());
	 
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
