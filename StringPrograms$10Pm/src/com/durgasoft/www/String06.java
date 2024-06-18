package com.durgasoft.www;
//creating a new String containing only Uppercases.
public class String06 {
	public static void main(String args[])
	{
		String s="Its Simple";
		String n="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				n=n+c;
			}
		}
		System.out.println(n);
	}

}
//output:IS
