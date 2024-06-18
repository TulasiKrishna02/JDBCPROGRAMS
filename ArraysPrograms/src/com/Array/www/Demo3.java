package com.Array.www;
class MyThread extends Thread
{
	public void run()
	{
		try {
			for(int i=0;i<10;i++)
			{
				System.out.println("I am a lazy Thread"+i);
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("I got Interupted");
		}
	}
	
}
class Demo3
{
public static void main(String args[]){
	
	MyThread t=new MyThread();
	t.start();
	t.interrupt();
	System.out.println("End of main method");
	}

}
