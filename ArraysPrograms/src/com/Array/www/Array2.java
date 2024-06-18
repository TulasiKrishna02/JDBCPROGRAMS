package com.Array.www;
//write a java program to display arry elements
public class Array2 {
	public static void main(String args[])
	{
		int arr[]= {12,45,36,89,75};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		for(int ele:arr)
		{
			System.out.println(ele);
		}
	}

}
