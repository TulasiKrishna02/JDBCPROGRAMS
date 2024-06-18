package com.nani.www;

import java.util.HashMap;

public class Javaprogram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//write a java program to generate
		//input:"aabbbc"
		//output:"a2b3c1"//character next integer,character integer ..etc.
		
		String str="aabbbc";
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(map.containsKey(ch))
			{
				
				int count=map.get(ch);
				
				count++;
				map.replace(ch,count);
			
			}
			else
			{
				map.put(ch, 1);
				
			}
			
			
		}
		
		for(Character key:map.keySet())
		{
			
			System.out.print(key+""+map.get(key));
		}

	}

}
