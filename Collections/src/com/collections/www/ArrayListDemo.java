package com.collections.www;
import java.io.*;
import java.util.*;
public class ArrayListDemo {
	public static void main(String args[])
	{
	ArrayList l1=new ArrayList();
	LinkedList l2=new LinkedList();
	System.out.println(l1 instanceof Serializable);
	System.out.println(l1 instanceof Cloneable) 	;

	System.out.println(l1 instanceof RandomAccess);
	System.out.println(l2 instanceof Serializable);
	System.out.println(l2 instanceof Cloneable);

	System.out.println(l2 instanceof RandomAccess);
	
	}


	}

