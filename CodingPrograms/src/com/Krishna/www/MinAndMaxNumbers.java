package com.Krishna.www;
//w.a.p to find Maximum and minimum numbers from array.
import java.util.Arrays;

public class MinAndMaxNumbers {

	public static void main(String[] args) {
		int[] arr= {4,10,59,22,45,60,2,3,4,5};
		
		int minNumber=Arrays.stream(arr).min().getAsInt();
		int maxNumber=Arrays.stream(arr).max().getAsInt();
		System.out.println("Minimum number is "+minNumber);
		System.out.println("MAximum number is "+maxNumber);
	}

}
