package thread.advanced;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Java program to demonstrate How to use CountDownLatch in Java. CountDownLatch is
 * useful if you want to start main processing thread once its dependency is completed
 * as illustrated in this CountDownLatch Example
 * 
 */
public class CountDownLatchDemo1 {

    public static void main(String args[]) {
    	
       final CountDownLatch latch = new CountDownLatch(3);
       
       ExecutorService executors = Executors.newFixedThreadPool(2);

       System.out.println("Starting threads");
		for (int i = 0; i < 3; i++) {
			executors.submit(new Servicee(i,latch));
		}
      
       try{
            latch.await();  //main thread is waiting on CountDownLatch to finish
            System.out.println("All theads are done");
       }catch(InterruptedException ie){
           ie.printStackTrace();
       }
    }
}

/**
 * Service class which will be executed by Thread using CountDownLatch synchronizer.
 */
class Servicee implements Runnable{
    private int i;
    private CountDownLatch latch;
  
    public Servicee(int i, CountDownLatch latch){
        this.i = i;
        this.latch = latch;
    }
  
    @Override
    public void run() {
        try {
        	System.out.println("Thread name : " +  Thread.currentThread().getName());
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
        }
        System.out.println("Thread "+ i + " is Up");
        latch.countDown(); //reduce count of CountDownLatch by 1
    }
  
}
