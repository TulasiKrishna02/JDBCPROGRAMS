package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class ArrayIterator {
    @SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String[] args) {
		List<String> flavours=new ArrayList<String>();
		flavours.add("chocolate");
		flavours.add("strawberry");
		flavours.add("Vanilla");
		
		Iterator<String> itr=flavours.iterator();
		Iterator<String> itr1=flavours.iterator();

		while(itr.hasNext()) {
			System.out.println("itr:"+itr.next());
			itr.remove();
		}
       System.out.println("------------");
       
       while(itr1.hasNext()) {
    	   System.out.println("itr1:"+itr1.next());
       }

		System.out.println("------------");
		
		List<Integer> li=new ArrayList<Integer>();
		ListIterator<Integer> litr=null;
		
		li.add(23);
		li.add(98);
		li.add(29);
		li.add(71);
		li.add(5);
		litr=li.listIterator();
		
		System.out.println("Element in forward direction");
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("Elements in backward direction");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		ArrayList a1=new ArrayList();
		
		a1.add("C");
		a1.add("A");
		a1.add("E");
		a1.add("B");
		a1.add("D");
		a1.add("F");
		
		System.out.println("original contents of a1:");
		
		Iterator itrArr=a1.iterator();
		
		while(itrArr.hasNext()) {
			
			String elem=(String)itrArr.next();
			if(elem=="E") {
				itrArr.remove();
			}
			System.out.print(elem);
		}
		Iterator itrAfter=a1.iterator();
		while(itrAfter.hasNext()) {
			System.out.print("\n"+itrAfter.next());
		}
	}

}
