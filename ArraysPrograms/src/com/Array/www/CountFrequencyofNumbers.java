package com.Array.www;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyofNumbers {
	public static void countFreq(int arr[])
	{
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i],1);
			}
		}
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
	}
    public static void main(String args[])
	{
		int arr[]= {10,10,20,30,20,5,5,4,6,8};
		countFreq(arr);
	}
}
