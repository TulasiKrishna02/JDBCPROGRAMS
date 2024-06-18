package com.MapPrograms.www;

import java.util.Comparator;
import java.util.TreeMap;

public class SortedMap {
	public static void main(String args[])
	{
		TreeMap t=new TreeMap(new MyComparator());
		
		t.put("xxx",10);
		t.put("AAA", 20);
		t.put("zzz", 30);
		t.put("LLL", 40);
		System.out.println(t);
	}
}
 class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}

	
}