package com.example.javabasic.day2.interfaceDemo.Akshay.day3;

@FunctionalInterface
public interface IYearInterface {
	static void displayDay(String year) {
		System.out.println(year);
	}
	
	void calculateYear();
}
