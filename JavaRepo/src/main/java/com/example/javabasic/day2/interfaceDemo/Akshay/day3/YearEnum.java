package com.example.javabasic.day2.interfaceDemo.Akshay.day3;

enum YearEnum implements IYearInterface {
//	2001, 2002, 2003, 2004, 2005, 2006;
	
	YEAR1, YEAR2;
	
//	void displayDayHere(String year) {
//		displayDay(year)
//	}
	
	public void calculateYear() {
		System.out.println("The calculated year is: " + this);
	}
	
}