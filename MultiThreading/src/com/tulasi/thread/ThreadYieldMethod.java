package com.tulasi.thread;
/*yield() method causes pause current executing Thread to give the chance
 * for remaining waiting Thread of same priority.
 * */
class MyThread3 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child-Thread");
			Thread.yield();//----(1)
		}
	}
}

public class ThreadYieldMethod {

	public static void main(String[] args) {
		MyThread3 t=new MyThread3();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main-Thread");
		}
	}
}
/*In the above example if we are commenting line1 Then both Threads will be executed simultaneously
 * and we can't except which Thread will complete first.
 * if we are not commenting line 1 then child thread always call yield() method because of That
 * main Thread will get the chance more no of times and the chance of completing main Thread first
 * is high.*/
 