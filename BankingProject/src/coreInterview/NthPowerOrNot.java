package coreInterview;

public class NthPowerOrNot {

	public static void main(String[] args) {
		
		int a = 81;
		int b = 3;
		
		double n = Math.log(a) / Math.log(b);
		double e = Math.ceil(n);
		if ((n / e) == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		int c = 1;
		while (c < a) {
			c = c * b;
		}

		if (c == a) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}
	}

}
