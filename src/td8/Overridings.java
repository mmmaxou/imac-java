package td8;

class A {
	int x = 1;

	public int getX() {
		return x;
	}

	static void printX(A a) {
		System.out.println("in A.printX");
		System.out.println("x " + a.x);
		System.out.println("getX() " + a.getX());
	}

	int m(A a) { return 1; }
}

class B extends A {
	int x = 2;

	public int getX() {
		return x;
	}

	static void printX(B b) {
		System.out.println("in B.printX");
		System.out.println("x " + b.x);
		System.out.println("getX() " + b.getX());
	}

	int m(B b) { return 2; }
}

public class Overridings {
	// Ex1.
	// 1 =>
	// in A.printX
	// x 1
	// getX() 1
	
	// 2 =>
	// in B.printX
	// x 2
	// getX() 2
	
	// 3 =>
	// in B.printX
	// x 1
	// getX() 2
	
	// 4 =>
	// <rien>
	
	
	public static void main(String[] args) {
		//A.printX(new A());     // 1
		//B.printX(new B());   // 2
		//A.printX(new B());   // 3
		A a = new B();
		a.m(a);              // 4
	}
}