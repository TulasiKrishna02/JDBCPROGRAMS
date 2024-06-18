package com.Array.www;

import java.util.Arrays;

public class Demo11 {

	public static void main(String[] args) {
		int arr[]= {7,2,5,6,9,9,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		
		
	}

}
