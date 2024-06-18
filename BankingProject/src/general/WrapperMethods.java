package general;

public class WrapperMethods {

	public static void main(String[] args) {
		
		
		Integer i = Integer.valueOf(42);
		System.out.println(i);
		
		Integer i2 = new Integer(42); // make a new wrapper object
		int b = i2.intValue();
		System.out.println(b);
		
		int i3 = Integer.parseInt("42");
		System.out.println(i3);
		
		String s3 = Integer.toHexString(254);
		System.out.println(s3);
		
	}
}

/*parseXxx() returns the named primitive.
valueOf() returns a newly created wrapped object of the type that invoked
the method.*/