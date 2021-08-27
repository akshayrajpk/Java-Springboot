package com.example.javabasic.day4.lamdba.program5;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<String>();
        cityList.add("Mumbai");
        cityList.add("Pune");
        cityList.add("Bangaluru");
        cityList.add("Kolkata");
        cityList.add("Chennai");
        cityList.forEach(
                // lambda expression
                (city) -> System.out.println(city)
        );
    }
}
