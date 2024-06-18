package com.durgasoft.www;
//we have to print Uppercase letters in the String
public class String3 {
	public static void main(String args[])
	{
		String s="PADMArao";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				System.out.println(c);
		}

	}

}
/*output:P
A
D
M
A
*/