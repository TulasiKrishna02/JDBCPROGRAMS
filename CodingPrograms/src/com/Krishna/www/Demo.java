package com.Krishna.www;
//Write a java program to display the string in reverse order?
public class Demo {

	public static void main(String args[]) {

		String str="This Is Java Class";

		String[] sarr=str.split(" ");   // This    Is    Java    Class

		
		//for each loop
		String rev="";
		for(String s:sarr)
		{
			char[] carr=s.toCharArray();

			for(int i=carr.length-1;i>=0;i--)
			{
				rev+=carr[i];
			}
			//add space
			rev+=" ";
		}

		System.out.println(rev);

		
	}

}
