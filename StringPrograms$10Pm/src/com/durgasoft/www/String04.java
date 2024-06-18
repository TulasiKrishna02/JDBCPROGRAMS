package com.durgasoft.www;
//count the upper case characters
public class String04 {
	public static void main(String args[])
	{
		String s="PADMArao";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				count++;
				System.out.print(c);
			}
		}
		System.out.println(count);
	}

}

//output:PADMA5
