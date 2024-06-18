package thread.basic;

public class WaitNotifyTest {

	public static void main(String[] args) {
		WaitNotifyMessage msg = new WaitNotifyMessage("process it");
		WaitNotifyWaiter waiter = new WaitNotifyWaiter(msg);
		new Thread(waiter, "waiter").start();

		WaitNotifyWaiter waiter1 = new WaitNotifyWaiter(msg);
		new Thread(waiter1, "waiter1").start();

		WaitNotifyNotifier notifier = new WaitNotifyNotifier(msg);
		new Thread(notifier, "notifier").start();
		System.out.println("All the threads are started");
	}

}