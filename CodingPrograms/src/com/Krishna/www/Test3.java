package com.Krishna.www;
//write a java program to find missing element from given AArray.
public class Test3 {
	public static void main(String args[])
	{
		int arr[]= {5,1,3,2,6,7};
		int n=arr.length+1;
		int sum=(n*(n+1))/2;
		
		for(int r:arr)
		{
			sum=sum-r;
		}
		System.out.println(sum);
	}

}
