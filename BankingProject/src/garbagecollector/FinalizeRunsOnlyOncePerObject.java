package garbagecollector;

public class FinalizeRunsOnlyOncePerObject {

	static FinalizeRunsOnlyOncePerObject f;
	public static void main(String[] args) throws InterruptedException {
		
		FinalizeRunsOnlyOncePerObject p = new FinalizeRunsOnlyOncePerObject();
		System.out.println(p.hashCode());
		p = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(f.hashCode());
		f = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("End of main");

	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
		f = this;
	}

}

// GC will be called only once per object
// In above example we after p=null, we are calling System.gc() for p-> object
// when it will come to finalize method , before finising our finalize method, we assigned same object now to f
// now f has reference to that same object and if obj has reference , GC will not delete that obj
// second time after f = null, we are calling again System.gc()
// in this case JVM will say , i have already run finalize method for this obj, 
// now i am not going to run finalize method and 
// i will delete it withput calling finalize method