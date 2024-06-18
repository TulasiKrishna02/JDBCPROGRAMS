package com.Krishna.www;
//write a program to perform sum of array elements.
public class Test1 {
	public static void main(String args[])
	{
		int[] arr= {2,4,7,1,3};
		int[] arr1= {9,8,6,4,3};
	
		int resArray[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			resArray[i]=arr[i]+arr1[i];
			
		}
		for(int ele:resArray)
		System.out.println(ele);
	}

}
