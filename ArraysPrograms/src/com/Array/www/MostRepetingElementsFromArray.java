package com.Array.www;

public class MostRepetingElementsFromArray {

	public static void main(String[] args) {
		int arr[]= {1,3,5,2,1,9,1,2,3,3,7,1,6};
		int max=0;
		int ele=0;
		for(int i=0;i<arr.length;i++)
		{ int cnt=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					cnt++;
				}
			}
			if(max<cnt)
			{
				max=cnt;
				ele=arr[i];
			}
		}
		System.out.println(ele+"Repeting"+max+"times");
		
		
	}

}
