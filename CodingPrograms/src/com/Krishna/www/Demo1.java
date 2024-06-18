package com.Krishna.www;

public class Demo1 {
	public static void main(String args[]) {
		        String date1 = "2000-00-10";
		        
		        String date2 = "2000-05-5";

		        System.out.println(dayOfYear(date1)); // Output: 10
		        
		        System.out.println(dayOfYear(date2)); // Output: 32
		    }

		    public static int dayOfYear(String dateString) {
		    	
		        // Split the input string into year, month, and day
		    	
		        String[] dateParts = dateString.split("-");
		        
		        int year = Integer.parseInt(dateParts[0]);
		        
		        int month = Integer.parseInt(dateParts[1]);
		        
		        int day = Integer.parseInt(dateParts[2]);

		        // Determine if the year is a leap year
		        
		        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		        // Calculate the day number of the year using a switch-case
		        int dayOfYear = 0;

		        switch (month - 1) { // month - 1 because months are 0-indexed in our switch-case
		            case 11: dayOfYear += 30; // November 
		            
		            case 10: dayOfYear += 31; // October
		            
		            case 9: dayOfYear += 30; // September
		            
		            case 8: dayOfYear += 31; // August
		            
		            case 7: dayOfYear += 31; // July
		            
		            case 6: dayOfYear += 30; // June
		            
		            case 5: dayOfYear += 31; // May
		            
		            case 4: dayOfYear += 30; // April
		            
		            case 3: dayOfYear += 31; // March
		            
		            case 2: dayOfYear += isLeapYear ? 29 : 28; // February
		            
		            case 1: dayOfYear += 31; // January
		             
		            case 0: dayOfYear += 0;  // No months before January
		        }

		        // Add the days in the current month
		        dayOfYear += day;

		        return dayOfYear;
		    
		
	}
}
