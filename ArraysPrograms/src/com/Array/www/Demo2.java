package com.Array.www;
//How to find CommonCharacters in two Strings.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo2 {
	public static void main(String args[])
	{
		String s1="aaaaabbbbbaaaacccc";
		String s2="ccccaaaaaabbbbbddd";
		Set s=new HashSet<>();
		
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(s2.indexOf(c)>=0)
			{
				s.add(c);
			}
		}
		if(s.size()==0)
		{
			System.out.println("There is no common elemets");
		}
		else
		{
			System.out.println("The common elemets are:"+s);
		}
	}

}

//output:The common elemets are:[a, b, c]
