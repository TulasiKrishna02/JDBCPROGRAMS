package general;

public class ThisSuper {

	public static void main(String[] args) {

		C c = new C();
	}

}

class A {
	public A(int a) {
		System.out.println("A");
	}
}

class B extends A {
	public B() {
		super(2);
		System.out.println("B");
	}
}

class C extends B {
	public C() {
		this(3);
		System.out.println("C");
	}
	public C(int a) {
		super();
		System.out.println("C overload");
	}

}