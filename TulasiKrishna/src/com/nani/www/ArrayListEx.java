package com.nani.www;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		
		
		list.add("Tulasi");
		list.add("Krishna");
		list.add("Nani");
		
		list.add(1,"pavan");
		list.add(2,"mokshit");
		
		System.out.println("This list is empty or not "+list.isEmpty());
		System.out.println("The list contains Krishna?"+list.contains("Krishna"));
		System.out.println("Element index 1 is "+list.get(1));
		
		ListIterator <String> li =list.listIterator();
		while(li.hasNext()) 
		{
		String	s =li.next();
			
		System.out.println(s);
			
		}
		
		System.out.println("Endloop...");
		list.remove(1);
		System.out.println(list);
		
	}

}
