package exceptionHandle;

public class ExceptionInInitializerErrorClass {

	//static int a = 10/0;
	
	static {
		String s = null;
		System.out.println(s.length());
	}
	public static void main(String[] args) {
		

	}

}

// In both the cases it will give ExceptionInInitializerError Error
// when we will get exception in static block or static variable initialization, in that we will get ExceptionInInitializerError