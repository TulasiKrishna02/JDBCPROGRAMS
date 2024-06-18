package coreInterview;

public class Factorial {

	public static void main(String[] args) {

		factorial();
		factorialRecursive();

	}

	private static void factorialRecursive() {
		int n = 5;
		int value = factorialMethod(n);
		System.out.println("Factorial of "+n+ " is "+ value);
	}
	
	private static int factorialMethod(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorialMethod(n - 1);

	}


	private static void factorial() {
		int n = 5;
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		System.out.println("Factorial of "+n+ " is "+ sum);
	}

}
