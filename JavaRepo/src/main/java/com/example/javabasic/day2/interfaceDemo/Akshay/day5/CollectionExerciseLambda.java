package com.example.javabasic.day2.interfaceDemo.Akshay.day5;

import java.util.ArrayList;
import java.util.*;
import java.util.function.Consumer;

public class CollectionExerciseLambda<name> {
    public static void main(String[] args) {
        List <String> names = new ArrayList<>();
        names.add("Ajay");
        names.add("Sujay");
        names.add("Vijay");
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);

        //Override Consumer Default
        Consumer<String> toUpper = new Consumer<String>()
        {
            @Override
            public void accept(String t)
            {
                System.out.println(t.toUpperCase());
            }
        };

        names.forEach(toUpper);

        //Sample Map
        Map<String, String> mapData = new HashMap<>();
        mapData.put("A","APPLE");
        mapData.forEach((k,v)-> System.out.println("Key :: "+k + " Value::"+ v));

        //Sets Exercise
        Set<Integer>  numbers = new HashSet<>();
        Set<String>  planet = new HashSet<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.forEach(element-> System.out.println(element));
        planet.add("Mercury");
        planet.add("Venus");
        planet.add("Earth");
        planet.forEach(System.out::println);
        planet.stream().forEachOrdered(System.out::println);
    }
}
