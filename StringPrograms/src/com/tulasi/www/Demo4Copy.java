package com.tulasi.www;
//Removing Multiple spaces in string without using library method
public class Demo4Copy {

	public static void main(String[] args) {
		String s="Removing   Multiple     Spaces   In THe Given Array ";
		String s1="";
		for(int i=0;i<s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				s1=s1+c;
			}
			else
			{
				char c1=s.charAt(i+1);
				if(c1==' ')
				{
					continue;
				}
				else
				{
					s1=s1+c;
				}
			}
			
			
		}
	System.out.println(s1);
		

	}

}
