package thread.advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Semaphores {

	public static void main(String[] args) throws Exception {

		ExecutorService executor = Executors.newCachedThreadPool();

		//newCachedThreadPool -> see this method explanation by clicking on it
		
		for (int i = 0; i < 200; i++) {
			executor.submit(new Runnable() {
				public void run() {
					Connection.getInstance().connect();
				}
			});
		}
		
		// above for loop will create 200 threads

		executor.shutdown();

		executor.awaitTermination(1, TimeUnit.DAYS);
	}

}

/*
 * In this program we want to allow only 10 connections per application , we can resist it by using Semaphore
 * If we will run code without using semaphore concept , in that it will have around 200 connections
 * Semaphore sem = new Semaphore(10,true); ->  it means it will release in the order it has acquired it
 */

class Connection {

	private static Connection conn = new Connection();

	private int connections = 0;

	private Semaphore sem = new Semaphore(10);

	public static Connection getInstance() {
		return conn;
	}

	public void connect() {

		try {

			sem.acquire();

		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		try {
			doconnect();
		} finally {
			sem.release();
		}
	}

	public void doconnect() {

		synchronized (this) {
			connections++;
			System.out.println("Current connaction : " + connections);
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		synchronized (this) {
			connections--;
		}
	}
}