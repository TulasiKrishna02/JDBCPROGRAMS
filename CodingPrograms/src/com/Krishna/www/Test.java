package com.Krishna.www;
//write a java program to delete first occurence ofa given number.
public class Test {
	public static void main(String args[])
	{
		int[] arr= {2,4,5,6,4,9,1,3,4};
		int[] resArray=new int[arr.length-1];
		int count=0;
		int j=0;
		int ele=4;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]== ele && count==0)
			{
				count++;
				continue;
			}
			
			resArray[j++]=arr[i];
		}
		for(int i:resArray)
		System.out.print(i);
	}

}
