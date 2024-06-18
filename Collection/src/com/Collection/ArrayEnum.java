package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class ArrayEnum {
    @SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		ArrayList<String > arrayList=new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("F");
		
		Enumeration e=Collections.enumeration(arrayList);
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("----------");
		
		Enumeration<String> enm=Collections.enumeration(arrayList);
		
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}

}
