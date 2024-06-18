package com.krishna;

/*Caaptalize the first and last letter of each word of a String*/
import java.util.Scanner;

public class Demo1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String str=sc.nextLine();
		String newString="";
		String[] str1=str.split("\\s");
		//System.out.println(str1[0]);
		for(String string:str1) {
			int length=string.length();
			String f=string.substring(0,1);
			String r=string.substring(1,length-1);
			String l=Character.toString(string.charAt(length-1));
			newString =newString+f.toUpperCase()+r+l.toUpperCase();
		}
		System.out.println("String after Capitalising First & Last Letter: "+newString);
		
	
	}

}
