package com.durgasoft.www;
//write a program to find the reverse of the String.
public class String10 {
	public static void main(String args[])
	{
		String s="Tulasi Krishna";
	    String rev="";
	    for(int i=0;i<s.length();i++)
	    {
	    	char c=s.charAt(i);
	    	rev=c+rev;
	    }
	    System.out.println(rev);
	}

}


//output:anhsirK isaluT