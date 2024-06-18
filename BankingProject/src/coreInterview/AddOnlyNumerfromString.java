
package coreInterview;

public class AddOnlyNumerfromString {

	/*
	 * Take a string as input and add the digits present in that
	 * 
	 * string. Ex:I/P="asdf12bgt3bh5j" O/P=20
	 * 
	 * I/P="iuy2hjg4jhg8" O/P=14
	 * 
	 * I/P="7 13" O/P=20
	 */
	
	public static void main(String[] args) {
		String input = "asdf12bgt3bh5j";
		char[] arr = input.toCharArray();
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i]))
				sum = sum + Integer.parseInt(String.valueOf(arr[i]));
		}
		System.out.println(sum);
	}

}
