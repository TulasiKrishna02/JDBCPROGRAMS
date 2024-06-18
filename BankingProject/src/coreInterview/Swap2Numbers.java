package coreInterview;

public class Swap2Numbers {

	public static void main(String[] args) {

		swapUsing3rdVariable();
		swapWithoutUsing3rdVariable();

	}

	private static void swapWithoutUsing3rdVariable() {
		int first = 5;
		int second = 12;
		System.out.println("before Swapping first = " + first + " and second = " + second);
		
		first=first+second;
		second=first-second;
		first=first-second;
				
		System.out.println("after Swapping first = " + first + " and second = " + second);
	}

	private static void swapUsing3rdVariable() {

		int first = 5;
		int second = 12;
		int variable;
		System.out.println("before Swapping first = " + first + " and second = " + second);

		variable = second;
		second = first;
		first = variable;

		System.out.println("after Swapping first = " + first + " and second = " + second);
	}

}
