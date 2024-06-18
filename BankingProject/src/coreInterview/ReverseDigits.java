package coreInterview;

public class ReverseDigits {

	public static void main(String[] args) {
		int number = 123456;
		int reverse = 0;

		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;

		}
		System.out.println("New number is: " + reverse);
	}

}
