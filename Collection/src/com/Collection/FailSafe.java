package com.Collection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe 
{
	
	
	public static void main(String[] args) 
	{
		ConcurrentHashMap<String, String> premiumphone=new ConcurrentHashMap<String, String>();
		premiumphone.put("Apple", "iphone");
		premiumphone.put("HTC", "HTC one");
		premiumphone.put("samsung", "s5");
		
		Iterator<String> iterator=premiumphone.keySet().iterator();
		
		while(iterator.hasNext()) 
		{
			System.out.println(premiumphone.get(iterator.next()));
			premiumphone.put("sony", "Xperia Z");
		}
		System.out.println("-----------");
		Iterator<String> iterator1=premiumphone.keySet().iterator();
		while(iterator1.hasNext()) 
		{
			System.out.println(premiumphone.get(iterator1.next()));
		}

	}

}
