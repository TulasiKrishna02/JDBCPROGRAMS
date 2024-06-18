package com.krishna;

/*Q)Write a java program to Reverse a number?
*/

class Demo {
	public static void main(String args[]) {
     int num=121;int rev=0,bac=num;
     while(num>0) {
    	 rev=rev*10+num%10;
    	 num=num/10;
     }
     
     if(bac==rev) {
    	 System.out.println("It is palindrom");
     }
     else {
    	 System.out.println("It is not a palindrom");
     }
		
	}
}