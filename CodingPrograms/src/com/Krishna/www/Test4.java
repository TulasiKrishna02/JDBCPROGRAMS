package com.Krishna.www;

import java.util.Arrays;

//write a program to segregate 0's and 1's.
/*public class Test4 {
	public static void main(String args[])
	{
		int arr[]= {1,0,1,1,0,0,1,0,0,1};
		
		Arrays.sort(arr);
		for(int ele:arr) 
		{
		System.out.print(ele+" ");
		}
	}

}*/

//second approach

public class Test4{
	public static void main(String args[])
	{
		int arr[]= {1,0,1,1,0,0,1,0,0,1};
		
		int[] resArr=new int[arr.length];
		int j=0;
		for(int ele:arr)
		{
			if(ele==0)
			{
				resArr[j++]=0;
						
			}
			
		}
		while(j<arr.length)
		{
			resArr[j++]=1;
			
		}
		for(int ele: resArr)
		{
			System.out.println(ele);
		}
	}
}

