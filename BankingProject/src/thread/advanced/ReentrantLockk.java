package thread.advanced;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockk {

	public static void main(String[] args) throws InterruptedException {
		final Runner runner = new Runner();
		Thread t1 = new Thread(new Runnable(){

			public void run() {
				try {
					runner.firstThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){

			public void run() {
				try {
					runner.secondThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		runner.finished();
		System.out.println("END");
	}
}

class Runner{

	private int count = 0;
	private Lock lock = new ReentrantLock();
	
	private void increment(){
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}
	public void firstThread()  throws InterruptedException{
		lock.lock();
		try{
			increment();
		}
		finally{
			lock.unlock();
			// why unlock is in finally because , if increment method will throw some exception , in that flow will not come to unlock, and it will never unlock
		}
	}

	public void secondThread()  throws InterruptedException{
		lock.lock();
		try{
			increment();
		}
		finally{
			lock.unlock();
		}
	}
	
	public void finished() {
		System.out.println(count);
	}
	
}
