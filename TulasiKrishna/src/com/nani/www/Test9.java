package com.nani.www;

import java.util.function.Function;

public class Test9 {

	public static void main(String[] args) {

		Function<String,String> f=s->s.toUpperCase();
		
		System.out.println(f.apply("DurgaSoftwareSolutions"));
		
		
	}

}
