package com.collections.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo2 {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		System.out.println(l);
		Collections.sort(l,new MyComparator());
		System.out.println(l);

	}

}
class MyComaprator implements Comparator{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();
		return s2.compareTo(s1);
		
	}

	}
