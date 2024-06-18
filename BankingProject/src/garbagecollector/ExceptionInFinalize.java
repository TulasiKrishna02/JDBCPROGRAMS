package garbagecollector;

public class ExceptionInFinalize {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();

		//new GC2(10).finalize();
		//uncomment and run
		
		for (int i = 0; i < 5; i++) {
			GC2 x = new GC2(i);
			x = null;
		}
		System.gc();
	}

}

class GC2 {

	String str;
	int id;

	GC2(int i) {
		this.str = new String("abcdefghijklmnopqrstuvwxyz");
		this.id = i;
	}

	protected void finalize() {
		System.out.println("before divide by zero :P ");
		System.out.println(10 / 0);
		//after divide by zero with no exception becuase exception is ingnored by JVM as finalize method is internally invoked by JVM
	}

}