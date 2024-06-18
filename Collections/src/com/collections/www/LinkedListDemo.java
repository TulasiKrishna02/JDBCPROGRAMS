package com.collections.www;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		System.out.println(l);
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		l.set(0,"software");
		l.add(0,"venkey");
		l.removeLast();
		l.removeFirst();
		l.addFirst("ccc");
		
		System.out.println(l);
		
		System.out.println(l.getFirst());
	}

}
