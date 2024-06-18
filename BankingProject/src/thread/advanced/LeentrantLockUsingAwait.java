package thread.advanced;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LeentrantLockUsingAwait {

	public static void main(String[] args) throws InterruptedException {
		final Runnerr runner = new Runnerr();
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

class Runnerr{

	private int count = 0;
	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();
	
	private void increment(){
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}
	public void firstThread()  throws InterruptedException{
		lock.lock();
		System.out.println("waiting");
		cond.await(); // same as wait // once await will come, it will release the lock
		System.out.println("Woken up !");
		try{
			System.out.println("firstThread : After secondThread() released the lock, then only i would be able to take it");
			increment();
		}
		finally{
			lock.unlock();
			// why unlock is in finally because , if increment method will throw some exception , in that flow will not come to unlock, and it will never unlock
		}
	}

	public void secondThread()  throws InterruptedException{
		Thread.sleep(2000);
		lock.lock();
		
		System.out.println("Press the retun key !");
		new Scanner(System.in).nextLine();
		System.out.println("Got return key .");
		cond.signal();
		try{
			System.out.println("secondThread : After cond.signal() i am running first and will unlock my lock after this work got over");
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
