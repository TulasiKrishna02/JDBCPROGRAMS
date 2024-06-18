package thread.basic;

public class ThreadJoinDeadlock2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("starting");
		
		Thread.currentThread().join();
		
		System.out.println("ending");
	}

}


// as main thread is calling join on main itself.
// so its a deadlock again 