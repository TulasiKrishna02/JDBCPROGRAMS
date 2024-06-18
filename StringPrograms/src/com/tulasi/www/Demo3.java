package com.tulasi.www;
//Remove multiple spaces in String with using the library methods.
public class Demo3 {

	public static void main(String[] args) {
		String s="This    is   a   String   ";
		//Regular expression: \\s--->single space
		//  \\s+ -->to remove multiple spaces.
	    s=s.replaceAll("\\s+", " ");
	    System.out.println(s);

	}

}
