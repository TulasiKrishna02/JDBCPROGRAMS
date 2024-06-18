package thread.advanced;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

	static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new Runnable(){

			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){

			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("END");
		

	}

	private static void producer() throws InterruptedException {

		Random random = new Random();
		while(true){
			int r = random.nextInt(100);
			System.out.println("Producer produced this int: "+ r);
			queue.put(r);
		}
		
	}

	private static void consumer() throws InterruptedException {
		
		Random random = new Random();

		while(true){
			Thread.sleep(100);
			
			if (random.nextInt(10) == 0) {
				Integer value = queue.take();
				System.out.println("Taken value : " + value + " Queue size is : " + queue.size());
			}
		} 	
		
	}

}
