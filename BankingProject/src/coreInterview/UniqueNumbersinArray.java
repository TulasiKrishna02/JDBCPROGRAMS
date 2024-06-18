package coreInterview;

import java.util.HashMap;
import java.util.Map.Entry;

public class UniqueNumbersinArray {

	/*
	 * Find the unique number that is present only once in array while all the
	 * others are present three times. Example: 2,3,5,1,2,2,5,3,5,3 
	 * Answer : 1 as 2,3,5 are repeated three times Complexity should be better than
	 * O(nlogn)
	 */
	public static void main(String[] args) {
		int[] arr= {2,3,5,2,9,2,5,3,5,3};
		int i = checkArray(arr);
		System.out.println(i);
	}

	private static int checkArray(int[] arr) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}else{
				hm.put(arr[i], 1);
			}
		}
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
			if(entry.getValue() == 1){
				return entry.getKey();
			}
		}
		return 0;
	}

}
