package com.Krishna.www;
//write a java program to find out leader element from given array.
public class Test2 {
	public static void main(String args[])
	{
		int[] arr= {2,10,6,34,19,1,7};
		
		int max=arr[arr.length-1];
		System.out.println(max);
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				System.out.println(max);
			}
		}
		
		
	}

}
