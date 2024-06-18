package thread.advanced;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class DeadlockResolution {

	public static void main(String[] args) throws InterruptedException {
		final Runnerrrrr runner = new Runnerrrrr();
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
	}
}

class Runnerrrrr{

	private Accountt acc1 = new Accountt();
	private Accountt acc2 = new Accountt();
	
	
/*	private int count = 0;
	private Condition cond = lock.newCondition();
	
	private void increment(){
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}*/
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	private void acquireLocks(Lock firstLock,Lock secondLock) throws InterruptedException{
		
		while (true) {
			// Acquire Locks
			
			boolean gotFirstLock = false;
			boolean gotSecondLock = false;
			try{
				gotFirstLock = firstLock.tryLock();
				gotSecondLock = secondLock.tryLock();
			}finally{
				if(gotFirstLock && gotSecondLock)
					return;
				if (gotFirstLock) {
					firstLock.unlock();
				}
				if (gotSecondLock) {
					secondLock.unlock();
				}
			}
			
			Thread.sleep(1);
		}
	}
	
	public void firstThread()  throws InterruptedException{
		
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			
			acquireLocks(lock1,lock2);
			try{
				Accountt.transfer(acc1, acc2, random.nextInt(100));
			}finally{
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void secondThread()  throws InterruptedException{
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			acquireLocks(lock2,lock1);
			try{
				Accountt.transfer(acc2, acc1, random.nextInt(100));
			}finally{
				lock1.unlock();
				lock2.unlock();
			}
		}
	}
	
	public void finished() {
		System.out.println("Account 1 balance : " + acc1.getBalance());
		System.out.println("Account 2 balance : " + acc2.getBalance());
		System.out.println("Combined balance : " + (acc1.getBalance() + acc2.getBalance()));
	}
	
}


class Accountt{
	private int balance = 10000;
	
	public void deposit(int amount){
		balance += amount;
	}
	
	public void withdraw(int amount){
		balance -= amount;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public static void transfer(Accountt aac1, Accountt aac2, int amount){
		aac1.withdraw(amount);
		aac2.deposit(amount);
	};
	
}