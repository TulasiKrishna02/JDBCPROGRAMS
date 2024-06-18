package coreInterview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class PrimeEvenPairFromArray {

	/*
	 * Take an array of integers as input. print the pair of
	 * 
	 * prime number and even number. Remaining numbers
	 * 
	 * should appear at the last. 
	 * Ex: I/P=[1,5,9,7,3,6,8,13,2,4]
	 * O/P=[5,6,7,8,3,4,1,9,13,2]
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 5, 9, 7, 3, 6, 8, 13, 2, 4 };

		LinkedHashSet<Integer> hashToBeDone = new LinkedHashSet<Integer>();
		HashSet<Integer> hashDone = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (isPrime(arr[i])) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] + 1 == arr[j]) {
						System.out.println("pair is " + arr[i] + "," + arr[j]);
						hashDone.add(arr[j]);
						break;
					}
					if(j == arr.length-1)
						hashToBeDone.add(arr[i]);
				}
			}else{
				if(!hashDone.contains(arr[i]))
					hashToBeDone.add(arr[i]);
			}
		}
		
		Iterator<Integer> iterator = hashToBeDone.iterator();
		while (iterator.hasNext()) {
			System.out.println("non pair is " + iterator.next() + " ");
		}

	}

	private static boolean isPrime(int n) {
		boolean isPrime = true;
		if (n == 1)
			return false;
		if (n == 2)
			return isPrime;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return isPrime;
	}

}
