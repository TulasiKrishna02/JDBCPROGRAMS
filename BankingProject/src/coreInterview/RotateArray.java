package coreInterview;

import java.util.HashMap;

public class RotateArray {

	/*
	 * Rotate a array by N. N can be smaller of greater than the array length.
	 * e.g {0,1,2,4,5,6,7} N =4 should return {5,6,7,4,0,1,2}.
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int number = 4;
		printRightRotatedArray(arr, number);
		System.out.println("");
		printLeftRotatedArray(arr, number);
		System.out.println("");
		/*rotateArrayActual(arr, number);
		System.out.println("");*/
		rotateArrayActualHashMap(arr, number);
	}

	public static void printRightRotatedArray(int[] array, int rotation) {
		int rotatedIndex = 0;
		int n = array.length;
		for (int i = 0; i < array.length; i++) {
			rotatedIndex = (i + rotation) % n;
			System.out.print(array[rotatedIndex] + " ");
		}
	}

	public static void printLeftRotatedArray(int[] array, int rotation) {
		int rotatedIndex = 0;
		int n = array.length;
		for (int i = 0; i < array.length; i++) {
			rotatedIndex = (i + (n - (rotation % n))) % n;
			System.out.print(array[rotatedIndex] + " ");
		}
	}
	
	public static void rotateArrayActual(int[] arr, int rotation) {
		int temp = 0;
		for (int i = 0; i < rotation; i++) {
			temp = arr[0];
			for (int j = 0; j < arr.length -1; j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length -1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	private static void rotateArrayActualHashMap(int[] arr, int number) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length - number ; i++) {
			if(i<number)
				hm.put(i, arr[i]);
			arr[i] = arr[ (i + number) % arr.length];
		}
		for (int i = 0; i < number; i++) {
			arr[arr.length - number + i] = (Integer) hm.get(i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
