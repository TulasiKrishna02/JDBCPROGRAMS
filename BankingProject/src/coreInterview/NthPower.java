package coreInterview;

public class NthPower {

	/*
	 * Write a function which returns the number of times the digit "1" appears
	 * in a number which is generated from raising 11 to the Nth power where N
	 * is passed in as an input parameter. The range of N is 0 to 1,000.
	 * 
	 * Be sure to unit test your solution.
	 * 
	 * For instance, If N is 3, the number is 1331 and the function returns 2.
	 * If N is 5, the function returns 3.
	 */
	public static void main(String[] args) {
		int pow = 1;
		int count = 0;

		long ans = (long) Math.pow(111, pow);
		System.out.println(ans);

		while (ans > 0) {
			if(ans % 10 == 1)
				count++;
			ans = ans/10;
		}
		
		System.out.println("Number of 1 present in answers : "+count);

	}
}
