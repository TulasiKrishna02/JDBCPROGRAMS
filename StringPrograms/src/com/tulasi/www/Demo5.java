package com.tulasi.www;

import java.util.Scanner;

//print the first character each word in the sentence
public class Demo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		System.out.println(s.length());
		//String s="theis pain good bad";
		String w="";s+=" ";String lw="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				w=w+c;
			}
			else
			{
			  if(w.length()>lw.length())
			  {
				  lw=w;
				  w="";
				
			  }else 
			  {
				w="";
			  }
			
				
			}
			
			
		}
		
		System.out.println(lw);
		System.out.println(lw.length());

	}

}
