package com.tulasi.thread;
class MyThread2 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child-Thread");
		}
	}
	
	}

public class ThreadPriority {

	public static void main(String[] args) {
		MyThread2 t=new MyThread2();
		t.setPriority(10);//----(1)
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main-Thread");
		}
		

	}

}
/*If we are commenting line1 then both main and child thread have the same priority-5
 * and hence we cant't except execution order and exact output.
 * if we are not commenting line 1 then main Thread has priority-5 and the child thread
 * has the priority-10 hence child Thread will get The chance first followed byMain Thread.
 * some platforms won't provide proper support for Thread priority.
 */