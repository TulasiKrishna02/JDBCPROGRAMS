package thread.advanced;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Deadlock {

	public static void main(String[] args) throws InterruptedException {
		final Runnerrrr runner = new Runnerrrr();
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

// O/p sometimes will be fine
// o/p sometimes will be deadlocl, coz while firstThread acquiring a lock1, meanwhile secondThread may acquire a lock on lock2, will be in deadlock
class Runnerrrr{

	private Account acc1 = new Account();
	private Account acc2 = new Account();
	
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	public void firstThread()  throws InterruptedException{
		
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			
			lock1.lock();
			lock2.lock();
			try{
				Account.transfer(acc1, acc2, random.nextInt(100));
			}finally{
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void secondThread()  throws InterruptedException{
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			lock2.lock();
			lock1.lock();
			try{
				Account.transfer(acc2, acc1, random.nextInt(100));
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


class Account{
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
	
	public static void transfer(Account aac1, Account aac2, int amount){
		aac1.withdraw(amount);
		aac2.deposit(amount);
	};
	
}