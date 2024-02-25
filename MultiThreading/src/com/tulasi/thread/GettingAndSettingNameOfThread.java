package com.tulasi.thread;
class MyThreadclass extends Thread{
	public void run()
	{
		System.out.println("Run method executed by Thread:"+Thread.currentThread().getName());
	}
	
}

public class GettingAndSettingNameOfThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThreadclass t=new MyThreadclass();
		t.start();
		System.out.println(t.getName());
		Thread.currentThread().setName("Pawan Kalyan");
		System.out.println("Main method executed by Thread:"+Thread.currentThread().getName());

	}

}
