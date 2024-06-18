package exceptionHandle;

public class ThrowsHierarchy {

	public static void main(String[] args) throws InterruptedException {
		m1();
	}

	private static void m1() throws InterruptedException {
		m2();
	}

	private static void m2() throws InterruptedException {
		m3();
	}

	private static void m3() throws InterruptedException {
		Thread.sleep(1000);
	}

}
