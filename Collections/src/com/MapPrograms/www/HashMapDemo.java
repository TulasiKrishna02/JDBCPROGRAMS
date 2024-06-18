package com.MapPrograms.www;
import java.util.*;


public class HashMapDemo {
	public static void main(String args[])
	{
		LinkedHashMap<String,Integer>m=new LinkedHashMap<String,Integer>();
		m.put("Tulasi",1000);
		m.put("Krishna", 2000);
		m.put("Nani",3000);
		m.put("pavan",200);
		m.put("yash", 300);
		m.put("kamal", 8000);
		//m.put(null, 600);
		m.put("joy", null);
		System.out.println(m);
		Set s=m.keySet();
	System.out.println(s);
	Collection c=m.values();
	System.out.println(c);
	Set s1=m.entrySet();
	System.out.println(s1);
	
	Iterator<Object> itr=s1.iterator();
	while(itr.hasNext())
	{
		Map.Entry<String,Integer> k=(Map.Entry<String,Integer>)itr.next();	
		System.out.println(k.getKey()+"....."+k.getValue()+"..."+k.getClass());
		if(k.getKey().equals("Tulasi"))
		{
			k.setValue(9000000);
		}
	}
	System.out.println(m);
	}

}
