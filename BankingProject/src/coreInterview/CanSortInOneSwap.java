package coreInterview;

public class CanSortInOneSwap {

	/*
	 * given an array with elements check if just by exchanging two elements of
	 * the array we get a sorted array.
	 */
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5,7 ,6};
		boolean canSort = canSortInOneSwap(arr);
		System.out.println(canSort);

	}

	private static boolean canSortInOneSwap(int[] arr) {
		int big = 0;
		int small = 0;
		int found = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				continue;
			} else {
				if (found == 0) {
					big = i;
				} else {
					small = i+1;
				}
				found++;
			}
		}
		if (found == 2 && arr[big+1] > arr[small] && arr[small-1] < arr[big] || found == 1 && ( arr.length == big+2 ||arr[big+2]> arr[big])) {
			swapNumbers(big, small, arr);
			return true;
		}
		if (found == 0) {
			System.out.println("Array already sorted !! ");
		}
		return false;
	}

	private static void swapNumbers(int i, int j, int[] array) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
