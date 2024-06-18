package coreInterview;

import java.util.HashSet;

public class TwoNumbersThatSumValue {

	/*
	  You have a very large array of integers. write this function boolean hasTwoNumbersThatSumValue(int[] arr, int num)
	 * */
	public static void main(String[] args) {
		int[] arr = {1,3,4,55,64,33,22,34,22};
		System.out.println(hasTwoNumbersThatSumValue(arr, 55));
	}
	
	public static boolean hasTwoNumbersThatSumValue(int[] arr, int num){
	    if(arr == null){
	        throw new NullPointerException();
	    }

	    HashSet<Integer> alreadyEncountered = new HashSet<Integer>();
	    for(int i = 0; i < arr.length; i++){
	        int val = arr[i];
	        if(alreadyEncountered.contains(num-val)){
	            return true;
	        }
	        alreadyEncountered.add(val);
	    }
	    return false;
	}
}
