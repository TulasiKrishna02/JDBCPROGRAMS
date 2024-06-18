package thread.advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {
	private int id;

	public Processor(int id) {
		this.id = id;
	}

	public void run() {

		System.out.println("starting: " + id + " with thread name: "+ Thread.currentThread().getName());

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}

		System.out.println("completed: " + id);
	}
}

public class ExecutorServicee {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executors = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 5; i++) {
			System.out.println("before: " + i);
			executors.submit(new Processor(i));
			System.out.println("after: " + i);
		}
		
		// It will shutdown my executor not immediately , but it will shutdown my executor only when all the thread have finished their work.
		executors.shutdown();
		

		System.out.println("All tasks submitted !!");

		// it will wait for 1 day, and then only will process next line.
		// Main point is, if suppose all the threads are shutdown automatically before 1 days, it will go to next line
		executors.awaitTermination(1, TimeUnit.DAYS);

		System.out.println("All tasks Completed !!");
	}

}
