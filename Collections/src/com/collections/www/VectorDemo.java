package com.collections.www;

import java.util.Vector;

public class VectorDemo {
	public static void main(String args[])
	{
		Vector v=new Vector();
		System.out.println(v.capacity());
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
			
		}
		System.out.println(v);
		System.out.println(v.size());
		v.addElement("Tulasi");
		System.out.println(v.capacity());
		
	}

}
