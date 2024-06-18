package coreInterview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UncommonElementsBetweenStrings {

	/*
	 * How to find non- common elements between two string arrays. Eg: String
	 * a[]={"a","b","c","d"}; String b[]={"b","c"}; O/p should be a,d
	 */
	public static void main(String[] args) {
		String[] a={"a","b","c","d"}; 
		String[] b={"b","c", "f"};

		printDifference(a,b);
	}

	public static void printDifference(String[] a, String[] b) {
		List<String> l1 = new LinkedList<String>(Arrays.asList(a));
		List<String> l2 = new LinkedList<String>(Arrays.asList(b));
		for (String temp : a) {
			if (!l2.contains(temp)) {
				System.out.print(temp + "\t");
				l2.add(temp);
			}
		}
		System.out.println();
		for (String temp : b) {
			if (!l1.contains(temp)) {
				System.out.print(temp + "\t");
				l1.add(temp);
			}

		}
	}

}
