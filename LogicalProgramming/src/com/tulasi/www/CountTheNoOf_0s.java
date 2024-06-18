package com.tulasi.www;

public class CountTheNoOf_0s {

	public static void main(String[] args) {
		int arr[]= {0,0,0,0,0,1,1,1};
		countzero(arr);

	}
	public static void countzero(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
			else
			{
				break;
			}
		}
		System.out.println("The no of Zero's:"+count);
		
	}

}
//output:The no of Zero's:5