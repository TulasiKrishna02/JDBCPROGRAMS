package com.tulasi.thread;

class Mythread extends Thread
    {
	  public void run()
	  {
		  for(int i=0;i<10;i++)
		  {
			  System.out.println("child-Thread");//Executed by child Thread
		  }
	  }
	
	}

public class ByExtendingThreadClass {
	public static void main(String args[])
	{
		Mythread t=new Mythread();//Thread Initialization
		t.start();//starting of a Thread
		for(int i=0;i<10;i++)
		{
			System.out.println("Main-Thread");//Executed by main Thread.
		}
		
	}

}
