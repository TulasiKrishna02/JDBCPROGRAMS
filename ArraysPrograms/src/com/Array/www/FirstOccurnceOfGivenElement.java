package com.Array.www;

public class FirstOccurnceOfGivenElement {

	public static void main(String[] args) {
		
		int arr[]= {2,4,5,6,4,9,1,3,4};
		int ele=4;
		int res[]=new int[arr.length-1];
		int cnt=0;
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==ele && cnt==0)
			{
				cnt++;
				continue;
				
			}
			res[j++]=arr[i];
		}
		for(int el:res)
		{
			System.out.print(el);
		}

	}

}
