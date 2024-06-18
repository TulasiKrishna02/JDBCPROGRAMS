package com.nani.www;

import java.util.LinkedList;

public class LinkedlistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("Tulasi");
		list.add("Krishna");
		list.add(1,"nani");
		list.addLast("pavan");
		list.addFirst("Harshit");
		System.out.println(list);
		
		System.out.println("is list contain pavan?:"+list.contains("pavan"));
		
	  System.out.println("Fist element is"+list.getFirst());
	  System.out.println("Fist element is"+list.getLast());
	  System.out.println("Element at 3 index is"+list.get(3));
	  
	  list.clone();
	  System.out.println("Fist element is"+list.size());
	  
	  for(String s:list)
	  {
		  System.out.println("Hello :" +s+"Welcome to telugu web guru java classes.....");
		  
		  //list.remove(2);
		  System.out.println(list);
		 
		  
	  }
	  
	  
	}
	

}
