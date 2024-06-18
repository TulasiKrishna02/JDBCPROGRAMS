package com.java8.www;

import java.util.function.Function;

public class Test2 {
	public static void main(String args[])
	{
		Function<Integer, Integer> f=i->i*i;
		System.out.println("The square of 5:"+f.apply(5));
		
		}

}
