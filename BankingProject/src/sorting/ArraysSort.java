package sorting;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 55, 3, 7, 2, 66, 44 };

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}

}
