package coreInterview;

public class CountZeroinSortedArray {

	/*
	 * Given a sorted array with only 0's and 1's.Count the number of 0's. e.g:
	 * 0 0 0 0 1 1 Ans: 4
	 */

	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 1, 1, 1 };
		countZero(arr);
	}

	private static void countZero(int[] arr) {
		int count= 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}else{
				break;
			}
		}
		System.out.println(count);
	}
}
