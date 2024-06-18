package thread.advanced;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable2 {

	static ExecutorService executor = Executors.newCachedThreadPool();

	public static void main(String[] args){

		Future<?> future = executor.submit(new Callable<Void>() {

			public Void call() throws Exception {
				Random random = new Random();
				int duration = random.nextInt(4000);

				if(duration > 2000){
					throw new IOException("Sleeping for too long ");
				}
				System.out.println("starting ..");

				Thread.sleep(duration);
				return null;
			}
		});
		
		executor.shutdown();
		try {
			System.out.println("Result is : " + future.get());
		} catch (InterruptedException e) {
			System.out.println(e);
		} catch (ExecutionException e) {
			System.out.println(e);
		}
	}
}

// If we don't want to return , in that we can use Void class, same like void return type, but we have return null for this
