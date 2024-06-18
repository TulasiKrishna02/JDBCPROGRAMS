package coreInterview;

public class SortBesedonMode {
	/*
	 * Given an array {1,2,3,4,5}. Sort the array based on modulo of 3. Expected
	 * output => {3,1,4,2,5} (Increasing order of modulo of 3) ({3,4,1,5,2} is
	 * also a right answer) Interviewer expects a solution with O(N) time and
	 * O(1) memory(No additional datastructure other than the input array).
	 */

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 6, 7, 9 };
		printArray(array);
		sortbyModulo(array, 3);
		printArray(array);
	}

	public static void sortbyModulo(int[] array, int mod) {
		int partition = 0;
		for (int search = 0; search < mod; ++search) {
			for (int i = partition; i < array.length; ++i) {
				if (array[i] % mod == search) {
					if (i != partition) {
						swapArrayElements(array, i, partition);
					}
					++partition;
				}
			}
		}
	}

	static void swapArrayElements(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	static void printArray(int[] array) {
		System.out.println();
		for (int i = 0; i < array.length; ++i) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
}
