package com.tulasi.thread;
/*if thread dont want to perform any operation for aparticular amount of time
 * then we should go for sleep() method*/
public class ThreadSleepMethod {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<10;i++)
		{
			System.out.println("slide-"+i);
			Thread.sleep(5000);
		}
	}

}
