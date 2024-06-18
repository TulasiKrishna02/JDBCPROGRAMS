package com.nani.www;
import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
	
		
		HashSet<String> names = new HashSet<String>();
		System.out.println("names.isEmpty():"+names.isEmpty());
		
		//adding elements/objects
		names.add("Tulasi");
		names.add("Telugu Web Guru");
		
		if(names.isEmpty())
			System.out.println("names hashset is still empty");
		else
			System.out.println("size of hashset names:"+names.size());
		
		
		if(names.contains("Telugu Web Guru"))//is there element is required or not
			names.remove("Telugu Web Guru");
		
		
		System.out.println("updated size of hashset names:"+names.size());
		
		
		
		names.clear();
		System.out.println("names.isEmpty()after clear:"+names.isEmpty());
		
		
		names.add("Tulasi");
		names.add("Telugu Web Guru");
		names.add("Ramu");
		names.add("Pavan");
		System.out.println(names);
		
		/*for(String n :names)
		{
			String newvalue="Welcome"+n;
			System.out.println(newvalue);
			
		}*/
		
		
		
		Iterator<String> newNames = names.iterator();
		while(newNames.hasNext())
		{
			
			String n=newNames.next();	
			String newvalue="Welcome"+n;
			System.out.println(newvalue);	
		
	   	
		}
		

	}

}
