package com.Krishna.www;

public class Demo2 {
	public static void main(String args[]) {
		String date1="2018-02-01";
		System.out.println(dayofyear(date1));
	}
	public static int dayofyear(String dateString) {
		
		String[] datesplit=dateString.split("-");
		int year=Integer.parseInt(datesplit[0]);
		int month=Integer.parseInt(datesplit[1]);
		int date=Integer.parseInt(datesplit[2]);
		
		int[] daysinRegularMonths= {31,27,31,30,31,30,31,31,30,31,30,31};
		
		boolean isLeapYear=(year%4==0 && year%100!=0 || year%400==0);
		
		if(isLeapYear) {
			daysinRegularMonths[1]=28;
		}
		
		int dayofyear=date;
		for(int i=0;i<month-1;i++) {
			dayofyear+=daysinRegularMonths[i];
			System.out.println(daysinRegularMonths[i]);
			System.out.println(dayofyear);
			
		}
		
		return dayofyear;
	}

}
