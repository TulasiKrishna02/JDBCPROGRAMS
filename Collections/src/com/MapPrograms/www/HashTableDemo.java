package com.MapPrograms.www;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String args[])
	{
		Hashtable h=new Hashtable();
		h.put(new temp1(10), "A");
		h.put(new temp1(20),"B");
		h.put(new temp1(40), "C");
		h.put(new temp1(0),"D");
		h.put(new temp1(20), "E");
		h.put(new temp1(48),"F");
		//h.put("durga",null);
		System.out.println(h);
	}
}
class temp1
{
int i;
temp1(int i)
{
this.i=i;	
}

public int hashCode()
{
	return i;
}
public String toString()
{
return i+"";	
}
}