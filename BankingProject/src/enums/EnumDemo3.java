package enums;

enum XYZ {
	X, Y, Z
}

public class EnumDemo3 {

	public static void main(String[] args) {

		XYZ x = XYZ.X;

		switch (x) {
		case X:
			System.out.println("X");
			break;
		case Y:
			System.out.println("Y");
			break;
		/*case R:
			System.out.println("Y");
			break;	*/ // It will give compile time error
		default:
			System.out.println("Z");
			break;
		}

	}

}

//From java 1.5 , we can pass enum in switch
