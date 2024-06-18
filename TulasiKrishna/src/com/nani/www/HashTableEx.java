package com.nani.www;

import java.util.Hashtable;
//Hashtable is synchronized version of hashmap

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String,String> maps=new Hashtable<String,String>();
		System.out.println("isHash table is empty "+maps.isEmpty());
		
		
		maps.put("Name","Tulasi");
		maps.put("Age", "23");
		maps.put("Village", "VIJ");
		
		System.out.println("isHash table is empty "+maps.isEmpty());	
		
		System.out.println("Hash table size is"+maps.size());
		
		
	}

}
