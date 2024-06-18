package com.Krishna.www;

public class Example {
/*in java switch statement can be used with primitive types except boolean,
String and enumerated types starting from java7.*/
	public static void main(String[] args) {
		String phone="APPLE";
		
		switch(phone)
		{
		case "Apple":
			System.out.println("Apple");
		case "APPLE":
			System.out.println("APPLE");
		default:
			System.out.println("Samsung");
		}

	}

}
