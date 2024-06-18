package outerInnerClass;

public class InnerClassObject {
	public static void main(String[] args) {

		C c = new C();
		C.D d = c.new D();
		d.getA();

		
		
		C1.D1 cd1 = new C1.D1();
		cd1.getA();
	}
}

class C{
	class D {
		void getA() {
			System.out.println("inner class");
		}
	}
}



class C1{
	static class D1 {
		void getA() {
			System.out.println("static inner class");
		}
	}
}
