package com.durgasoft.www;
//print each Character of the String in separateline.
public class String01 {
	public static void main(String args[])
	{
		String s="ITS SIMPLE";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			System.out.println(c);
		}

	}

}
/*Output:
I
T
S
 
S
I
M
P
L
E
*/