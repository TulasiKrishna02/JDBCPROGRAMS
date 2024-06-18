package thread.basic;

class Mythread1 extends Thread {

}

public class ParentChildThreadPriority {

	public static void main(String[] args) {

		System.out.println("by default main thread priority: " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		Mythread1 t = new Mythread1();
		System.out.println("newly created thread priority: " + t.getPriority());

	}

}

// child thread will take priority from parent thread
// like t thread took priority from parent(main) thread
