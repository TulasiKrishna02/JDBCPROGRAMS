package com.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailFast {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String, String> primiumphone=new ConcurrentHashMap<String, String>();
		
		primiumphone.put("Apple", "iphone");
		primiumphone.put("HTC","HTC one");
		primiumphone.put("samsung","s5");
		
		Iterator<String> iterator=primiumphone.keySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(primiumphone.get(iterator.next()));
			
			primiumphone.put("sony", "xeperia z");
		}
		

	}

}
