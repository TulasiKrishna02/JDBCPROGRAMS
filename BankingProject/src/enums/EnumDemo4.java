package enums;

public class EnumDemo4 {

	public static void main(String[] args) {
		
	}

}

enum XX{
	
}

/*enum YY extends XX {
	
	
}*/

//It will compile time error/
// simple rule we can't use extends keyword with enum

// Note: All enum internally extends java.lang.Enum Class and this in-built class implements Serializable and Comparable I.


interface I{
	void doit();
}


enum DD implements I{
	;

	@Override
	public void doit() {
		
	}
	
}


// But we can implement any number of interfaces