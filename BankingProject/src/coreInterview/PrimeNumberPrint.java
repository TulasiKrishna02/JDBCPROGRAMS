package coreInterview;

public class PrimeNumberPrint {

	public static void main(String args[]) {

		printPrimeNumbers();
		firstNPrimeNumbers();
		
	}
	private static void firstNPrimeNumbers() {	
		
		int limit = 25;
		int count = 0;
		long primeNumberSum =0;
		System.out.println("First " + limit + " prime numbers are :");
		
		for (int i = 2; i > 1; i++) {
			
			boolean isPrime = true;
			
			for (int j = 2; j <= i / 2; j++) {
				
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime){
				count++;
				System.out.print(i + " ");
				primeNumberSum = primeNumberSum + i;
			}	
			if(count == limit){
				break;
			}
		}
		System.out.println("\nsum of First " + limit + " prime numbers is :"+primeNumberSum);
	}
	
	private static void printPrimeNumbers() {	
		int limit = 100;
		long primeNumberSum =0;
		System.out.println("Prime numbers between 1 and " + limit);
		
		for (int i = 2; i < 100; i++) {
			
			boolean isPrime = true;
			
			for (int j = 2; j <= i / 2; j++) {
				
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime){
				System.out.print(i + " ");
				primeNumberSum = primeNumberSum + i;
			}	
		}
		System.out.println("\nsum of primenummbers is :"+primeNumberSum);
	}
}