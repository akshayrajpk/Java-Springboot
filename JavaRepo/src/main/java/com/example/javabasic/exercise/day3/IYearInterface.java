package com.example.javabasic.exercise.day3;

@FunctionalInterface
public interface IYearInterface {
	static void displayDay(String year) {
		System.out.println(year);
	}
	
	void calculateYear();
}
