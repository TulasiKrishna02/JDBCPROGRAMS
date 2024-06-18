package com.durgasoft.www;
//print ASCII code of each character of a String.
public class String02 {
	public static void main(String args[])
	{
	   String s="ITS SIMPLE0123";
	   for(int i=0;i<s.length();i++)
	   {
		   char c=s.charAt(i);
		   System.out.println(c+"...."+(int)c);
	   }
	}

}
/*output:
I....73
T....84
S....83
 ....32
S....83
I....73
M....77
P....80
L....76
E....69
0....48
1....49
2....50
3....51
*/