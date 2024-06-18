package com.Krishna.www;
//Remove duplicate elements from a list.
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(3,1,5,10,2,9,3,5,7,9,10);
		List<Integer> ans=list.stream().distinct().toList();
		System.out.println(ans);

	}

}
