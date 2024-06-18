package enums;

enum Ber{
	KF,RC,RO;
	Ber(){
		System.out.println("Enum cons");
	}
}
public class EnumDemo8 {

	public static void main(String[] args) {
		System.out.println("Before hello");
		Ber b = Ber.KF;
		System.out.println("After hello");
	}

}

// coz all constants are static final and will be loaded at the time of class loading itself
