package com.tulasi.thread;
class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child-Thread");//Executed BY child Thread
		}
	}
	
}

public class ByImplementingRunnableInterface {
	public  static void main(String args[])
	{
	MyRunnable r=new MyRunnable();
	Thread t=new Thread(r);//target Runnable
	t.start();
	for(int i=0;i<10;i++)
	{
		System.out.println("main-Thread");//Executed by Main Thread.
	}
	

}}
