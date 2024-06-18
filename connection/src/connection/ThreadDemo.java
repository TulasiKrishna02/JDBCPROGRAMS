package connection;

class MyThread extends Thread
{
	public void run()
	{
	System.out.println("Run method executed by thread:"
			 +Thread.currentThread().getName());
	
	}

}
public class ThreadDemo {
	public static void main(String args[])
	{
		MyThread t=new MyThread();
		t.start();
		System.out.println("Main method is executed by Thread:"
		+Thread.currentThread().getName());
		
		
	}

}
