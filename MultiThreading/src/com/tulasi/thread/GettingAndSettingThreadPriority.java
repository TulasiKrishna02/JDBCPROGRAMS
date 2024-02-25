package com.tulasi.thread;
class MyThread1 extends Thread{
	
	}
public class GettingAndSettingThreadPriority {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(15);//IllegalstateException
		Thread.currentThread().setPriority(7);
		MyThread1 t=new MyThread1();
		System.out.println(t.getPriority());

	}

}
