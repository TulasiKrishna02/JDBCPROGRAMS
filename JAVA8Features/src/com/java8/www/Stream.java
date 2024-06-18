package com.java8.www;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Stream {
	/**
	 * @param args
	 */
	public static void main(String args[])
	{
		java.util.stream.Stream<Integer> s=java.util.stream.Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		
		
	}

	

	
	
}


