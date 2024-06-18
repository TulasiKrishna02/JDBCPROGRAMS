package thread.synchronize;
public class ThreadAtClassLevel implements Runnable {
 
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        synchronized(ThreadAtClassLevel.class) {
            System.out.println("synchronized block " + Thread.currentThread().getName() + " start");
            
            try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("synchronized block " + Thread.currentThread().getName() + " end");
        }
    }
 
    public static void main(String[] args) {
        ThreadAtClassLevel b1 = new ThreadAtClassLevel();
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);
         
        ThreadAtClassLevel b2 = new ThreadAtClassLevel();
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