package com.nani.www;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String,String> maps=new HashMap<String,String>();
		
		
		System.out.println("is hashmap Empty "+maps.isEmpty());
		maps.put("f1","Telugu");
		maps.put("sl","English");
       maps.put("t1","Hindi");		
       //System.out.println("is hashmap Empty "+maps.isEmpty());
       
       if(maps.isEmpty())
       
    	   System.out.println("Map Still Empty");
    	   
       else
    	   System.out.println("Maps Size is:"+maps.size());
       
       System.out.println("KeySet():"+maps.keySet());
       System.out.println("Values():"+maps.values());
       
       System.out.println("Value of the key sl is "+maps.get("sl"));
       
       
       System.out.println("EnterySet()"+maps.entrySet());
       
       System.out.println("is key s1 available?"+maps.containsKey("sl"));
       System.out.println("is value English available?"+maps.containsValue("English"));



}
}