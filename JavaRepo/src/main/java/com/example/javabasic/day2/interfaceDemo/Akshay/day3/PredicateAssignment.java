package com.example.javabasic.day2.interfaceDemo.Akshay.day3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numberList = Arrays.asList(2, 3, 1, 5, 6, 7, 8, 9, 12);
		Predicate<Integer> predicate = i -> i % 2 == 0;
		System.out.println("Iterative");
		 for(Integer num : numberList){
	            if(predicate.test(num)){
	                System.out.println(num);
	            }
	        }
		 System.out.println("Single Line");
		 numberList.stream().filter(predicate).forEach(System.out::println);
		 
		 //Enum Embed
		 YearEnum.YEAR1.calculateYear();
//		 YearEnum.YEAR2.displayDayHere("2020");
	}

}
