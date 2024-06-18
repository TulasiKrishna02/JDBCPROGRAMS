package com.Krishna.www;

public class AddonlynumbersFromString {
	
	public static void main(String args[])
	{
		String s="tulasi14pari";
		char[] arr=s.toCharArray();
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(arr[i]))
			sum=sum+Integer.parseInt(String.valueOf(arr[i]));
		}
		System.out.println(sum);
	}

}
