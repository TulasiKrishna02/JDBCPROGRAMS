package com.tulasi.www;

public class Demo6 {
	public static void main(String args[])
	{
		String s="This is tulasi krishna dokku";
		String s1=s;
		String w="";s+=" ";int count=0;
		for(int i=0;i<s.length();i++) 
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
			  w=w+c;	
			}
			else
			{
			   if(w.equalsIgnoreCase("is"))
			   {  
			     count++;
		
			   }
			  w="";  
			}
			
		}
		if(count==0)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found");
		}
	}

}
