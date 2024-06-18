package com.nani.www;

public class SortingNumbers {

	public static void main(String[] args) {
     int num[]= {55,17,90,1,66,22};
     int n=num.length;
     for(int i=0;i<n;i++)
     {
    	 for(int j=i+1;j<n;j++)
    	 {
    		 if(num[i]>num[j])
    		 {
    			 int temp=num[i];
    			 num[i]=num[j];
    			 num[j]=temp;
    		 }
    	 }
     }
     for(int j=0;j<n;j++)
     {
    	 System.out.println(num[j]);
     }
	}

}
