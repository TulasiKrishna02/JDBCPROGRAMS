package com.nani.www;

public class CountEvenAndOddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=796583556;
		int evencount=0;
		int oddcount =0;
		
		
		while(num>0)//1234
		{
			
		int rem=num%10;//4
		 if(rem%2==0)
		 {
			 evencount++;
			 
		 }
		 else
		 {
			 oddcount++;
		 }
			
		 num=num/10;//Eliminate last digit
			
		}
		 System.out.println("Even count numbers"+evencount);
		 System.out.println("Odd count numbers:"+oddcount);
		
		

	}

}
