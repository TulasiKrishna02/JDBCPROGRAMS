package com.collections.www;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {
	public static void main(String args[])
	{
		PriorityQueue<String> q=new PriorityQueue(15,new MyCs());
		q.offer("A");
		q.offer("z");
		q.offer("L");
		q.offer("B");
		System.out.println(q);
	}
}
class MyCs implements Comparator{
	public int compare(Object o1,Object o2)
	{
		String s1=(String)o1;
		String s2=o2.toString();
		return s1.compareTo(s2);
	}
	
	
}
