package com.tulasi.thread;
//waiting of chid Thread untill completing main Thread.
class MyThread4 extends Thread{
	static Thread mt;
	public void run()
	{
		try {
			mt.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("Child-Thread");
		}
		
	}
	
}

public class ThreadjoinEx2 {

	public static void main(String[] args) throws InterruptedException {
		MyThread4.mt=Thread.currentThread();
		MyThread4 t=new MyThread4();
		t.start();
		//t.join();----(1)
		for(int i=0;i<10;i++)
		{
			System.out.println("main-Thread");
			Thread.sleep(2000);
		}
		

	}

}
/*if main thread calls join() method on child thread object and child Thread 
 * calls join()method on main Thread object Then both Threads will waite forever
 * and the programme will will stuckd(This is something like dead lock)
 * */
