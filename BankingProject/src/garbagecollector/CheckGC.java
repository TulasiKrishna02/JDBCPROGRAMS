package garbagecollector;


public class CheckGC {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory: " + rt.totalMemory());
		System.out.println("Free Memory BEFORE program executes = " + rt.freeMemory());
		for (int i = 0; i < 10000; i++) {
			String str = new String("hello");
			str = str + new String("sdfs");
		}
		System.out.println("Free Memory AFTER program executes = " + rt.freeMemory());
		rt.gc(); // an alternate to System.gc()
		System.out.println("Free Memory AFTER garbage collector executes = " + rt.freeMemory());
	}
}

//-Xmx2048m
// we can use this to increase heap size
// in configuration, in VM Arguments we can pass this