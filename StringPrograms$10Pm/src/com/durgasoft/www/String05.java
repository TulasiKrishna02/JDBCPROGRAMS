package com.durgasoft.www;
//print countUppercase,lower case characters of String.
public class String05 {
	public static void main(String args[])
	{
		String s="THIS is TulasiKrishna";
		int count=0,count1=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				count++;
				//System.out.print(c);
			}
			if(Character.isLowerCase(c))
			{
				count1++;
				//System.out.print(c);
			}
			
		}
		System.out.println(count+"...."+count1);
	}

}
//output:6....13
