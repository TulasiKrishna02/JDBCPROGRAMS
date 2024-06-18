package thread.synchronize;
public class ThreadAtObjectLevel implements Runnable {
 
	private static Object mutex = new Object(); // if it will not be static then every thread will have its own copy of mutex
	// try to run it after removing private static
	//o/p will be t1/t2 or t3/t4 will start at a time because both have different runnable object
    @Override
    public void run() {
        objectLock();
    }
     
    public void objectLock() {
        System.out.println(Thread.currentThread().getName());
        synchronized(mutex) {
            System.out.println("synchronized block " + Thread.currentThread().getName() + " start");
            
            try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("synchronized block " + Thread.currentThread().getName() + " end");
        }
    }
 
    public static void main(String[] args) {
        ThreadAtObjectLevel b1 = new ThreadAtObjectLevel();
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);
         
        ThreadAtObjectLevel b2 = new ThreadAtObjectLevel();
        Thread t3 = new Thread(b2);
        Thread t4 = new Thread(b2);
        
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t4.setName("t4");
         
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}