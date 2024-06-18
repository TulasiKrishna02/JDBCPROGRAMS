package com.thread.www;

class Abc implements Runnable
{
 public void run()
 {
   for(int i=0;i<=10;i++)
   {
	   System.out.println("Child Thread");
   }
}
public class ThreadDemo1{
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getName());
		
		Abc a=new Abc();
		Thread t=new Thread(a);
		System.out.println(t.getName());
		t.start();
		Thread.currentThread().setName("Tulasi Krishna");
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
		
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main Thread");
		}
		
	}
}

}
