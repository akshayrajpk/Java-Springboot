package com.example.javabasic.day2.interfaceDemo.functionalInterfaceDemo3;

import java.util.*;
import java.util.function.Predicate;

public class FunctionalDemo3 {
    public static void main(String args[]) {
        // create a list of strings
        List<String> names = Arrays.asList("Kumar", "kailash", "Palash", "Subashri", "Anupam", "Amrit", "Mohan");
        List<String> cityList = Arrays.asList("MUMBAI", "DELHI", "PUNE", "Bangaluru", "Chennai", "Kolkata");
        // declare string type predicate and use lambda expression to create object
        Predicate<String> predicate =
                (s) -> s.startsWith("M");
        //Case Insensitive Predicate
        Predicate<String> predicateIgnoreCase =
                (s) -> s.toLowerCase().contains("k");
        System.out.println("Starting with M:");

        // Iterate through the list
        for (String st : names) {
            // test each entry with predicate
            if (predicate.test(st)) {
                System.out.println(st);
                System.out.println("====================");
            }
        }

        for (String st : names) {
         // test each entry with predicate Case In-Sensitive
            if (predicateIgnoreCase.test(st)) {
                System.out.println(st); // Mohan
                System.out.println("====================");
            }
        }

        for (String st : cityList) {
           // test each entry with predicate
            if (predicate.test(st)) {
                System.out.println(st); //MUMBAI
            }
        }
    }
}
