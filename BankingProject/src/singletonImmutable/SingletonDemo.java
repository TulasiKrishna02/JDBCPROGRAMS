package singletonImmutable;

class ClassicSingleton {

	private static ClassicSingleton instance = null;

	private ClassicSingleton() {
	}

	public static ClassicSingleton getInstance() {
		if (instance == null) {
			instance = new ClassicSingleton();
		}
		return instance;
	}

	protected void demoMethod() {
		System.out.println("demoMethod for ClassicSingleton");
	}
}

// Thread Safe
class SingletonThreadSafe {

	private static SingletonThreadSafe instance = null;
	private static Object mutex = new Object();

	private SingletonThreadSafe() {
	}

	public static SingletonThreadSafe getInstance() {
		if (instance == null) {
			synchronized (mutex) {
				if (instance == null)
					instance = new SingletonThreadSafe();
			}
		}
		return instance;
	}
	
	protected void demoMethod() {
		System.out.println("demoMethod for SingletonThreadSafe");
	}
}

class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {
	} // A private Constructor prevents any other class from instantiating.

	public static Singleton getInstance() { /* Static 'instance' method */
		return singleton;
	}

	protected void demoMethod() {
		System.out.println("demoMethod for singleton");
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}

public class SingletonDemo {
	public static void main(String[] args) {
		Singleton tmp = Singleton.getInstance();
		tmp.demoMethod();

		ClassicSingleton demo = ClassicSingleton.getInstance();
		demo.demoMethod();
		
		SingletonThreadSafe safe = SingletonThreadSafe.getInstance();
		safe.demoMethod();
	}
}
