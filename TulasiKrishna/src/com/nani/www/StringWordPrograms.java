package com.nani.www;



public class StringWordPrograms {
	
	public static void main(String args[])
	{
		
		String s="Tulasi Krishna dad mom ";
		String w=""; s+=" "; String lw="";
		try {
		for(int i=0;i<s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				w+=c;
			}
			else {
				if(w.length()>lw.length())
					lw=w;
			    w="";
			}
			
			
			
		}
		System.out.println("longest word :"+lw);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
}
		

	


