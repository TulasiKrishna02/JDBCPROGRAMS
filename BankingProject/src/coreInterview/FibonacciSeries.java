package coreInterview;

public class FibonacciSeries {

	public static void main(String[] args) {

		fibonacci();
		for (int counter = 0; counter <= 10; counter++)
			System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacciRecursive(counter));
	}

	public static int fibonacciRecursive(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	private static void fibonacci() {
		int number = 10;
		int prev, next, sum;
		prev = next = 1;

		for (int i = 1; i <= number; i++) {
			System.out.println(prev);
			sum = prev + next;
			prev = next;
			next = sum;
		}
	}

}
