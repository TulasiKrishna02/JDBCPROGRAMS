package com.tulasi.www;
public class Demo {
	public static void main(String args[])
	{
		String s="A Red seed";s+=" ";
		String w="",ns="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
			 w+=c;
			}
			else
			{
              if(w.equalsIgnoreCase("Red"))
              {
            	  ns=ns+"blue"+" ";
              }
              else
              {
            	  ns=ns+w+" ";
              }
				w="";
			}
			
			
		}
		 System.out.println(ns);
	}
	
}