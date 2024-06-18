package com.tulasi.www;

public class Demo8 {
	public static void main(String... args)
	{
		String s="a red seed";String w="";s+=" ";String ns="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				w=w+c;
			}
			else
			{
				if(w.equals("red"))
					ns=ns+"BlUE"+" ";
				else
					ns=ns+w+" ";
			w="";	
			}
		}
		System.out.println(ns);
	}

}
