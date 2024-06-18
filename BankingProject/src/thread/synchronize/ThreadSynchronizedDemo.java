package thread.synchronize;

public class ThreadSynchronizedDemo {

	public static void main(String[] args) {
		Displayy d1 = new Displayy();
		Displayy d2 = new Displayy();
		MyThreadd t1 = new MyThreadd(d1, "Dhoni");
		MyThreadd t2 = new MyThreadd(d2, "Yuvraj");
		
		t1.start();
		t2.start();
		// case:1
		// If we will create two thread for Display, obviously we will get irregular o/p
		// coz both object will acquire lock on different objects(i.e d1 and d2)
		
		// case:2
		// If we will create only d1 and will pass same d1 for both the threads we will get regular o/p
		// coz in this object will acquire lock, and only 1 thread will be able to enter into sysc method
	}

}

class MyThreadd extends Thread {

	Displayy d;
	String name;

	public MyThreadd(Displayy d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

class Displayy {

	public synchronized void wish(String name) {

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