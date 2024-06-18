package thread.basic;

public class ThreadJoinDeadlock {

	public static void main(String[] args) throws InterruptedException {
		
		
		MyThread3.mt = Thread.currentThread();
		
		MyThread3 t = new MyThread3();
		t.start();
		t.join(); // as main method has called this join , so it will wait for t to finish
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main");
		}
	}
}

class MyThread4 extends Thread{
	
	static Thread mt;
	public void run() {
		
		try {
			mt.join(); // as child method has called this join , so it will wait for mt(main thread) to finish
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("child");
		}
		
	}
}


// this deadlock state as both thread as waiting for each other to finish.