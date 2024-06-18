package com.java8.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo6 {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("cup",null,"forest","sky","book",null,"thereater");
		List<String> result=new ArrayList<String>();
		result=words.stream().filter(w->w!=null).collect(Collectors.toList());
		System.out.println(result);

	}

}
