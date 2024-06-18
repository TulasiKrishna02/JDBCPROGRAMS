package com.collections.www;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
	public static void main(String args[])
	{
		TreeSet t=new TreeSet(new MyComaparator());
		t.add("Roja");
		t.add("ShobaRani");
		t.add("GangaBavani");
		t.add("Ramulamma");
		System.out.println(t);
		
	}

}
class MyComaparator implements Comparator
{
public int compare(Object obj1,Object obj2)
{
String s1=(String)obj1;
String s2=(String)obj2;
return -s1.compareTo(s2);
}

}

