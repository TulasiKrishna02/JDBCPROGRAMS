package thread.synchronize;

public class ThreadSynchronizedComplex {


	public static void main(String[] args) {
		Methods m = new Methods();
		Thread t1 = new Thread(new TR1(m));
		Thread t2 = new Thread(new TR2(m));
		Thread t3 = new Thread(new TR3(m));
		Thread t4 = new Thread(new TR4(m));
		Thread t5 = new Thread(new TR5(m));
		Thread t6 = new Thread(new TR6(m));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}

class TR1 implements Runnable {
	Methods m;

	public TR1(Methods m) {
		this.m = m;
	}

	public void run() {
		m.m1();
	}

}

class TR2 implements Runnable {
	Methods m;

	public TR2(Methods m) {
		this.m = m;
	}

	public void run() {
		m.m2();
	}

}

class TR3 implements Runnable {
	Methods m;

	public TR3(Methods m) {
		this.m = m;
	}

	public void run() {
		m.m3();
	}

}

class TR4 implements Runnable {
	Methods m;

	public TR4(Methods m) {
		this.m = m;
	}

	public void run() {
		m.m4();
	}

}

class TR5 implements Runnable {
	Methods m;

	public TR5(Methods m) {
		this.m = m;
	}

	public void run() {
		m.m5();
	}

}

class TR6 implements Runnable {
	Methods m;

	public TR6(Methods m) {
		this.m = m;
	}

	public void run() {
		m.m6();
	}

}

class Methods {

	static synchronized void m1(){
		System.out.println("this is m1: this will take lock on Class as method is static synchronized");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	static synchronized void m2(){
		System.out.println("this is m2: this will take lock on Class as method is static synchronized");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static void m3() {
		System.out.println("this is m3: this is simple static method, so any thread can access this");
	}

	synchronized void m4(){
		System.out.println("this is m4: this is synchronized method, so only one object can have lock for sysn method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void m5() {
		System.out.println("this is m5: this is synchronized method, so only one object can have lock for sysn method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	void m6() {
		System.out.println("this is m6: this is simple method, so any thread can access this");
	}
}
// output:

//this is m1: this will take lock on Class as method is static synchronized
//this is m3: this is simple static method, so any thread can access this
//this is m5: this is synchronized method, so only one object can have lock for sysn method
//this is m6: this is simple method, so any thread can access this
// -> Sleep thread(5000)
//this is m4: this is synchronized method, so only one object can have lock for sysn method
//this is m2: this will take lock on Class as method is static synchronized

// explanation
// If m1 took look , it means it has acquired lock on Method class
// m3 can run simply as it a normal method
// m5 ran first, it means it has acquired lock on m object
// m6 is running simply coz it a normal method, any one can run this.
// Now m4 is waiting for 5 secs, coz, m5 method has lock on obj, and before m4 , and once it will release lock, then only m4 can run
// m2 is also waiting , coz, m2 has also lock on class level , and before m2, m1 has acquired lock on m1(class level lock).

// For each object , we have one object level lock
// For each Class , we have one class level lock
// Both have no relation with each other and can take/release lock independently.
