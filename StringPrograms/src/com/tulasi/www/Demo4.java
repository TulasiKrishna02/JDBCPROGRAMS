package com.tulasi.www;
//Remove multiple spaces in String without Library method.
public class Demo4 {

	public static void main(String[] args) {
		String s1="This    is   a  String ";
		String s2="";
		for(int i=0;i<s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch != ' ')
			{
				s2=s2+ch;
			}
			else
			{
				char ch1=s1.charAt(i+1);
				if(ch1==' ')
				{
					continue;
				}
				else
				{
					s2=s2+ch;
				}
			}
			
		}
      System.out.println(s2);
	}

}
