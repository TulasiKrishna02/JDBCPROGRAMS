package com.Array.www;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindCommonCharacters {
	public static void findCommonCharacters(String s1,String s2)
	{
		//StringBuffer sb=new StringBuffer();
		Set commoncharacters =new HashSet();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(s2.indexOf(ch)>=0)
				//sb.append(ch);
				commoncharacters.add(ch);
				
		}
		//if(sb.toString().length()==0)
		if(commoncharacters.size()==0)
			System.out.println("There are no common characters in both Strings");
		else
			System.out.println("common characters in both strings:"+commoncharacters);
	}
	
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter The String 1:");
		String s1=sc.nextLine();
		System.out.println("please enter String 2:");
		String s2=sc.nextLine();
		findCommonCharacters(s1,s2);
		
	}

}
