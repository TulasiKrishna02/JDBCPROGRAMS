package com.tulasi.thread;

public class DeadLock {
	public static void main(String args[]) throws InterruptedException
	{
		Thread.currentThread().join();
	}


}
/*if a Thread calls join() method on same Thread itself.
 * Then the programme will be stucked(This is something like a dead lock)
 * in this case thread has to wait infinate amount of time
 * */
 