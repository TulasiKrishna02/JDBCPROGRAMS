package thread.basic;

public class ThreadPriority {

	public static void main(String[] args) {

		MyThread2 t = new MyThread2();
		t.setPriority(10);
		t.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}

	}

}

class MyThread2 extends Thread {


	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
		}
	}
}

// ideally we should get child thread o/p followed by main thread o/p
// we are getting mix o/p because some platform doesn't provide proper support for thread priorities(like windows 7) 
