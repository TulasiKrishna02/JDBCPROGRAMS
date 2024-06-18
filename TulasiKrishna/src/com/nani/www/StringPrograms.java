package com.nani.www;

import java.util.Scanner;

public class StringPrograms {

	public static void main(String[] args) {
		String w="";
       String s="mom dad kak pap lal sas bob Anna Or ";
       s+=" "; int count=0;
       for(int i=0;i<s.length()-1;i++)
       {
    	   char c=s.charAt(i);
    	    if(c!=' ')
    	    	w+=c;
    	    else
    	    {
    	    	if(w.equalsIgnoreCase("Or"))
    	    		count++;
    	    	
    	    	w="";
    	    	
    	    	
    	    }
    	   
    	   
    	   
    	   
       }
       if(count==0)
    	   System.out.println("notfound");
       else
    	   System.out.println("found");
    	   
    	   
       
	}

}
