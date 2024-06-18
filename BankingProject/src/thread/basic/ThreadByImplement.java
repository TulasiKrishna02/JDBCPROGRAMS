package thread.basic;

public class ThreadByImplement implements Runnable {
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("hi");
		
	}

	public static void main(String[] args) {
		
		ThreadByImplement c = new ThreadByImplement();
		// Thread t = new Thread(c);
		Thread t = new Thread(c, "sdfsd");
		t.start();
		
	}
}