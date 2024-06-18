package thread.basic;

public class ThreadByExtend extends Thread {
	private String threadName;

	ThreadByExtend(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 1; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				//Thread.sleep(50);
			}
		} catch (Exception e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public static void main(String args[]) {

		ThreadByExtend T1 = new ThreadByExtend("Thread-1");
		T1.start();
		ThreadByExtend T2 = new ThreadByExtend("Thread-2");
		T2.start();
		System.out.println(T1.isAlive());
		while (T1.isAlive()) {
			System.out.print("hi");
		}
		System.out.println(T1.isAlive());
	}

}