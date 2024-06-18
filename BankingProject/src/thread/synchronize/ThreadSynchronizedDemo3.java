package thread.synchronize;

public class ThreadSynchronizedDemo3 {

	public static void main(String[] args) {
		DisplayNC d = new DisplayNC();
		
		Thread1 t1 = new Thread1(d);
		Thread2 t2 = new Thread2(d);
		
		t1.start();
		t2.start();
		// case:1
		// If sync method is static , it means we acquired lock on CLASS Level
	}

}

class Thread1 extends Thread {

	DisplayNC d;

	public Thread1(DisplayNC d) {
		this.d = d;
	}

	public void run() {

		d.displayNumber();

	}
}
class Thread2 extends Thread {
	
	DisplayNC d;
	String name;
	
	public Thread2(DisplayNC d) {
		this.d = d;
	}
	
	public void run() {
		
		d.displaycharacter();
		
	}
}

class DisplayNC {

	public synchronized void displayNumber() {

		for (int i = 0; i < 10; i++) {

			System.out.print(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	public synchronized void displaycharacter() {

		for (int i = 65; i < 75; i++) {

			System.out.print((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}