package thread.synchronize;

public class ThreadSynchronizedDemo2 {

	public static void main(String[] args) {
		Displayyy d1 = new Displayyy();
		Displayyy d2 = new Displayyy();
		MyThreaddd t1 = new MyThreaddd(d1, "Dhoni");
		MyThreaddd t2 = new MyThreaddd(d2, "Yuvraj");
		
		t1.start();
		t2.start();
		// case:1
		// If sync method is static , it means we acquired lock on CLASS Level
	}

}

class MyThreaddd extends Thread {

	Displayyy d;
	String name;

	public MyThreaddd(Displayyy d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {

		d.wish(name);

	}
}

class Displayyy {

	public static synchronized void wish(String name) {

		for (int i = 0; i < 10; i++) {

			System.out.print("Good Morning: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}