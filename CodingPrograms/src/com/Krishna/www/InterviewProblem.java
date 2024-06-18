package com.Krishna.www;

public class InterviewProblem { 
	
	public static void main(String args[]) {
		
		String date1 = "2000-01-10";
		
		String date2 = "2000-02-5";

		System.out.println(dayOfYear(date1)); // Output: 10

		System.out.println(dayOfYear(date2)); // Output: 36 (Corrected from 32 to 36 based on calculation)
	}

	public static int dayOfYear(String dateString) {

		// Split the input string into year, month, and day
		
		String[] dateParts = dateString.split("-");
		
		int year = Integer.parseInt(dateParts[0]);
		
		int month = Integer.parseInt(dateParts[1]);
		
		int day = Integer.parseInt(dateParts[2]);

		// Days in each month for a regular year
		
		int[] daysInMonthRegular = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Determine if the year is a leap year
		
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		// Adjust February days for leap years
		if (isLeapYear) {
			daysInMonthRegular[1] = 29;
		}

		// Calculate the day number of the year
		
		int dayOfYear = day; // start with the days of the current month
		
		for (int i = 0; i < month - 1; i++) {
			
			dayOfYear += daysInMonthRegular[i];
		}

		return dayOfYear;
	}

}
