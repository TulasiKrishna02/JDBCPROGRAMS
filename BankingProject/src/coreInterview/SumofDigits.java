package coreInterview;

public class SumofDigits {

	public static void main(String[] args) {
		int number = 5372;
		int sum = 0;
		int n;

		while (number > 0) {
			n = number % 10;
			sum = sum + n;
			number = number / 10;
		}
		System.out.println("Sum = " + sum);
	}

}
