package com.durgasoft.www;
//creating a new String with digits first and then characters.
public class String07 {

	public static void main(String[] args) {
		String s="NO26 Sound";
		String n="",r="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
				n=n+c;
			}
			else
			{
				r=r+c;
			}
		}
		String f=n+r;
		System.out.println(f);
	}

}
//output:26NO Sound
