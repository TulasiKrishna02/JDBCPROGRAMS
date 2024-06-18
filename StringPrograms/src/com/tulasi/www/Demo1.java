package com.tulasi.www;
//Generate output string from given String
public class Demo1 {
	public static void main(String args[])
	{
		String s="a2b3c4d2e5f6";
		for(int i=0;i<s.length()-1;i=i+2)
		{
			char c1=s.charAt(i);
			char c2=s.charAt(i+1);
			//System.out.println(i);
			//System.out.println(i+1);
			int n=(int)c2-48;
			for(int j=0;j<n;j++)
			{
				System.out.print(c1);
			}
		}
	}

}
