package com.java8.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo1 {
	public static void main(String args[])
	{
		/*ArrayList<Integer> numbersList=new ArrayList<Integer>();
		numbersList.add(10);
		numbersList.add(15);
		numbersList.add(20);
		numbersList.add(25);*/
		
		List<Integer>numbersList=Arrays.asList(10,15,20,25,30);
		
		List<Integer>evennumbersList=new ArrayList<Integer>();
		//without using Streams
		/*for(int n:numbersList)
		{
			if(n%2==0)
			{
				evennumbersList.add(n);
				
			}
		}
		System.out.println(evennumbersList);*/
		
		//with Streams
		
		/*evennumbersList=numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evennumbersList);*/
		//numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		numbersList.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
