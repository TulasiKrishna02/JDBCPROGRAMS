package com.tulasi.thread;
/*join()method :If a thread wants to wait untill completing someother Thread
 * Then we should go for join()method*/
class Mythread12 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Seeta-Thread"); 
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadjoinMethod {

	public static void main(String[] args) throws InterruptedException{
		Mythread12 t=new Mythread12(); 
		t.start();
		t.join();//-----(1)
		for(int i=0;i<10;i++)
		{
			System.out.println("Rama-Thread");
		}
		

	}

}
/*if we comment line 1 then both main and child Thread will execute simultaneously and we can't
 * expect exact output.
 * if we are not commenting line 1 then main Thread call join() method on child Thread object hence
 * main Thread will wait untill completing child Thread.*/
 