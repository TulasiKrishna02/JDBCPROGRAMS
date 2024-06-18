package com.nani.www;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionEx {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		
		System.out.println("names.isEmpty :"+names.isEmpty());
		
		names.add("Tulasi");
		names.add("Krishna");
		
		System.out.println("names.isEmpty :"+names.isEmpty());
		if(names.isEmpty())
			System.out.println("hash set is still empty");
		else
			System.out.println("Hash set having elements with size:"+names.size());
		if(names.contains("Tulasi"))
			names.remove("Tulasi");
			System.out.println("Hash set updated size :"+names.size());
			
			names.clear();
			
			System.out.println("names.isEmpty :"+names.isEmpty());
		
			
			names.add("Tulasi");
			names.add("Krishna");
			names.add("TWG");
			names.add("Nani");
			names.add("Vijay");
			
			System.out.println("names.isEmpty :"+names.isEmpty());
			System.out.println("Print size of hash set :"+names.size());
			
			System.out.println(names);
			
			
			/*for(String n:names)
			{
				String newvalue = "Hello "+n;
				
				System.out.println(newvalue);
			}*/
			
		Iterator<String> newValue = names.iterator();

			while(newValue.hasNext())
			{
				
			String	n=newValue.next();
			
			String abc = "HELLO "+n;
			
			System.out.println(abc);
				
			}
			
			
	

	}

}
