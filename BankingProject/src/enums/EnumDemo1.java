package enums;

enum Beeer {
FC,RC,RO,FO;
}

public class EnumDemo1 {

	public static void main(String[] args) {
		Beeer b = Beeer.FC;
		System.out.println(b);

	}

}

//inside enum toString method is implemented to return name of the constant directly.