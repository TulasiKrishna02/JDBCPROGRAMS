package coreInterview;

public class PermutationofInput {

	/*
	 * Length is given as input.Print all possible permutations of numbers
	 * between 0-9. Eg: if input length=4 all possible combinations can be 0123,
	 * 1234, 5678,9864,...etc all combinations of length from in all numbers
	 * between 0-9
	 */
	
	public static void main(String[] args) {
		printSequential(2, "");
	}

	public static void printSequential(int digit, String base) {
		for (int j = 0; j < 10; j++) {
			if (base.indexOf(String.valueOf(j)) == -1) {
				String newBase = base + j;
				if (digit > 1) {
					printSequential(digit - 1, newBase);
				} else {
					System.out.println(newBase);
				}
			}
		}
	}

	public static void printSequential(int digit) {
		printSequential(digit, "");
	}

}
