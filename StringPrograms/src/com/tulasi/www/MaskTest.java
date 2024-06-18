package com.tulasi.www;

public class MaskTest {
	public static String mask(String creaditcard)
	{
		String x="xxxx-xxxx-xxxx-";
		//Line-1
		return x+creaditcard.substring(15,19);
		//StringBuilder sb=new StringBuilder(creaditcard);
		//String s=sb.substring(15,19);
		//return x+s;
		/*StringBuilder sb=new StringBuilder(x);
		sb.append(creaditcard,15,19);
		return sb.toString();
		StringBuilder sb=new StringBuilder(creaditcard);
		StringBuilder s=sb.insert(0,x);
		return s.toString();*/	
	}
	public static void main(String args[])
	{
		System.out.println(mask("1234-5678-9101-5979"));
	}
	

}
