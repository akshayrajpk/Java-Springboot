package com.example.javabasic.day5.forEach.program1;
/*------------Iterating by passing lambda expression--------------*/
import java.util.*;
import java.util.function.Consumer;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<>();

       /*  Exercise 1
       Set<String> nameSets = new HashSet<>();
        nameSets.forEach(name-> System.out.println(name));
        */

        /* Exercise 2
        Map<String, String> mapData = new HashMap<>();
        mapData.put("A","APPLE");
        mapData.forEach((k,v)-> System.out.println("Key :: "+k + " Value::"+ v));*/

        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hockey");
        System.out.println("------------Iterating by passing lambda expression--------------");
        gamesList.forEach(games -> System.out.println(games));
    }
}
