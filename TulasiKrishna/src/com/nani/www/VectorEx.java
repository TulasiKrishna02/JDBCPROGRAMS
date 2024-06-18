package com.nani.www;

import java.util.Enumeration;
import java.util.Vector;

    class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<String> list=new Vector<String>(6,3);
		
		
		System.out.println("initial capacity:"+list.capacity());
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		System.out.println("Capacity after adding 6th element"+list.capacity());
		
		list.add("g");
		
		System.out.println("Capacity after adding 7th element"+list.capacity());
		
		System.out.println("First element in vector list"+list.firstElement());
		System.out.println("Last element in vector list"+list.lastElement());
		
		
		Enumeration<String> en= list.elements();
		
		
		while(en.hasMoreElements())
			
          System.out.println("Hello "+en.nextElement());		
		
		

	}

}
