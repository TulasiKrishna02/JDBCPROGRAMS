package com.nani.www;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20,b=30;
		
		System.out.println("Before swapping values are :"+a+" "+b);
		
		
		/*int temp=a;
		    a=b;
		    b=temp;
		*/
		
		
		
		a=a+b;//20+30=50
		b=a-b;//50-30=20
	
		a=a-b;//50-20=30
		
		System.out.println("After swapping values are:"+a+" "+b);
		
		
		
	}

}
