package com.durgasoft.www;
//write a program To reverse a case of a String
public class String09 {
	public static void main(String args[] )
	{
		String s="NO26 Sound";
		String r="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				r=r+Character.toLowerCase(c);
			}
			else
			{
				r=r+Character.toUpperCase(c);
			}

		}
		System.out.println(r);
		
	}
	
	//output:no26 sOUND

}
