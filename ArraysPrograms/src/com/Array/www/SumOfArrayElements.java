package com.Array.www;
//write a java program to perform sum of array elements.
public class SumOfArrayElements {
	public static void main(String args[])
	{
		int arr1[]= {2,4,7,1,3};
		int arr2[]= {9,8,6,4,3};
		int res[]=new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			res[i]=arr1[i]+arr2[i];
		}
		for(int ele:res)
		{
			System.out.print(ele+" ");
		}
	}

}
