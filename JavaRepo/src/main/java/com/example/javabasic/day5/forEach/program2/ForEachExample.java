package com.example.javabasic.day5.forEach.program2;
/*------------Iterating by passing method reference---------------*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hockey");
        System.out.println("------------Iterating by passing method reference---------------");
        gamesList.forEach(System.out::println);


    }
}
