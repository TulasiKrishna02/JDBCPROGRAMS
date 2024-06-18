package thread.basic;

public class ThreadInterrupt2 {

	public static void main(String[] args) {

		MyThread7 t = new MyThread7();
		t.start();
		t.interrupt(); //  main thread interrupts child thread t, and it will wait till child thread(t) will go to sleeping mode
		
		System.out.println("end of main");
	}

}

class MyThread7 extends Thread{
	
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("i am lazy thread "+ i);
		}
		
		System.out.println("i want to sleep now !! ");
		try {
				Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			System.out.println("somebody interrupted me !!!");
		}
	}

}