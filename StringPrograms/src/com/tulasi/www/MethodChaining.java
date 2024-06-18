package com.tulasi.www;

public class MethodChaining {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("durga").append("software").insert(2,"xyz").delete(2,5);
	    System.out.println(sb);
	}

}
