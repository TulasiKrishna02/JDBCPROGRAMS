package thread.basic;

public class ThreadJoin2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		MyThread3.mt = Thread.currentThread();
		
		MyThread3 t = new MyThread3();
		t.start();
		
		Thread.sleep(3000);
		
		System.out.println("End Main");
	}
}

class MyThread3 extends Thread{
	
	static Thread mt;
	public void run() {
		
		try {
			mt.join(); // child will be waiting as child thread has called mt.join
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("child");
		}
		
	}
}


// child thread call join mt.join(), on main thread as mt is main thread
// it will always run main o/p and then child o/p