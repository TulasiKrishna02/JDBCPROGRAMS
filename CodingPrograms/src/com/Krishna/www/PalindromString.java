package com.Krishna.www;

public class PalindromString {
	public static void main(String args[]) {
		String str="nan";
		//String org=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			
			rev=rev+str.charAt(i);
			
		}
		
		if(str.equals(rev)) {
			System.out.println("it ia a palindrom");
		}
		else {
			System.out.println("it is not apalindrom");
		}
		
		
		
	}

}
