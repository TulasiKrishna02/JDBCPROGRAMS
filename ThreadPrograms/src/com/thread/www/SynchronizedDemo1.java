package com.thread.www;

class Display2
{
 public  synchronized void displayn()
 {
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
	}
	try {
		Thread.sleep(5000);
	}
	catch(InterruptedException e) {}
 }
 public synchronized void displayc()
 {
	 for(int i=65;i<=75;i++)
	 {
		System.out.println((char)i); 
	 }
	 try {
		 Thread.sleep(5000);
	 }
	 catch(InterruptedException e)
	 {}
 }
}
class MyThr1 extends Thread
{
Display2 d;	
MyThr1(Display2 d)
{
	this.d=d;
	}
public void run()
{
d.displayn();	
}
}
class MyThr2 extends Thread
{
Display2 d;
  MyThr2(Display2 d)
   {
	this.d=d;
	}
  public void run()
  {
	  d.displayc();
  }
}

public class SynchronizedDemo1 {

	public static void main(String[] args) {
		Display2 d=new Display2();
		MyThr1 t=new MyThr1(d);
		MyThr2 t1=new MyThr2(d);
		t.start();
		t1.start();
		

	}

}
