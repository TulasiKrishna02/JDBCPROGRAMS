package com.durgasoft.www;
//create a new String After Removing all Spaces.
public class String08 {
	public static void main(String args[])
	{
		String s="NO26 sound";
		String n="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!Character.isWhitespace(c))
			{
				n=n+c;
			}
		}
		System.out.println(n);
	}

}
//output:NO26sound