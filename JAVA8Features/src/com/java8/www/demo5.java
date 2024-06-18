package com.java8.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo5 {
	public static void main(String args[])
	{
		List<String> names=Arrays.asList("tulasi","Krishna","pavanKalyan","Ramcharan");
		List<String> lnames=new ArrayList<String>();
		
		lnames=names.stream().filter(str->str.length()>6 &&str.length()<8).collect(Collectors.toList());
		//System.out.println(lnames);
		//names.stream().filter(str->str.length()>6 &&str.length()<8).forEach(str->System.out.println(str));
		
		names.stream().filter(str->str.length()>6 &&str.length()<8).forEach(System.out::println);
		
	
	}

}
