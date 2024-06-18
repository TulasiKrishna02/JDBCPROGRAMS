package com.java8.www;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Test5 {

	public static void main(String[] args) {
		int arr[]= {2,4,2,1,2,2,4,4};
		findArray(arr);

	}
	private static void findArray(int[] arr) {
		Set<Integer> UniqueEle=new HashSet<Integer>();
		Set<Integer> DuplicateElements=Arrays.stream(arr)
				.filter(i->!UniqueEle.add(i))
				.boxed()
				.collect(Collectors.toSet());
		System.out.println(UniqueEle);
		System.out.println(DuplicateElements);
	}

}
