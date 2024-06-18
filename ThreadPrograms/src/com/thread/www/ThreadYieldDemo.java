package com.thread.www;

class Pavan extends Thread
{
public void run()
{
	for(int i=0;i<10;i++)
	{
		System.out.println("Child Thread");
		Thread.yield();
	}
	}
}

public class ThreadYieldDemo {
	public static void main(String args[])
	{
		Pavan p=new Pavan();
		p.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
