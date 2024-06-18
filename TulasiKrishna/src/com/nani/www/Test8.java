package com.nani.www;

import java.util.function.Function;

public class Test8 {
	
	static public void main(String x[])
	{
		Function<Integer,Integer>f=i->i*i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(10));
		
		
		
		
	}

}
