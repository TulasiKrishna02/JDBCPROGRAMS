package com.Array.www;

public class PaalindromNumber {

	public static void main(String[] args) {
		
		int num=525 ;
		
		int org=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(org==rev) {
			System.out.println("palindrom number");
		}
		else {
			System.out.println("not a palindrom");
		}

	}

}
