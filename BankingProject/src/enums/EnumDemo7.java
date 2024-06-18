package enums;

public enum EnumDemo7 {
	STAR,FISH,GUPPY; // we are putting something after the constants, it is mandatory to put semicolon; 
	public static void main(String[] args) {
	}
}


//CE(CompileTime ERRO): coz no semicolon
/*public enum EnumDemo7 {
	STAR,FISH,GUPPY
	public static void main(String[] args) {
	}
}*/

//CE(CompileTime ERRO): coz no semicolon, if no constants are there still we have to put semicolon;
/*public enum EnumDemo7 {
	
	public static void main(String[] args) {
	}
}*/

//CE(CompileTime ERRO): coz constants should be at the starting 
/*public enum EnumDemo7 {
	public static void main(String[] args) {
	}
	STAR,FISH,GUPPY;
}*/

// Perfectly fine

enum Demo {
	;
	void m1() {
	}
}
