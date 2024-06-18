package coreInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class SortArrayOnFrequency {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 8, 1, 2, 2, 3, 2, 2, 7, 8, 4, 4, 4 };
		int[] out = new int[arr.length];
		final HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
				al.add(arr[i]);
			}
		}

		//System.out.println(hm);
		//System.out.println(al);
		
		Collections.sort(al, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return hm.get(o2).compareTo(hm.get(o1));
			}
		});

		//System.out.println(al);
		int j = 0;
		for (Integer val : al) {
			int repeat = hm.get(val);
			for (int i = 0; i < repeat; i++) {
				out[j] = val;
				j++;
			}
		}

		for (int ii : out) {
			System.out.print(" " + ii);
		}
	}

}
