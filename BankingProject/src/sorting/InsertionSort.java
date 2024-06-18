package sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int[] input = { 100, 99, 88, 77, 66, 55, 44, 23, 6 };
		insertionSort(input);
	}

	private static void printNumbers(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

	public static void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
			printNumbers(array);
		}
	}
}