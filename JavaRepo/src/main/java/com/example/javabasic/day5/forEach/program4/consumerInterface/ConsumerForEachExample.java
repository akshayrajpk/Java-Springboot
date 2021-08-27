package com.example.javabasic.day5.forEach.program4.consumerInterface;

import java.util.*;
import java.util.function.Consumer;

@FunctionalInterface
interface UserConsumer<T> extends Consumer<Set<String>> {

}

public class ConsumerForEachExample {

    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");

        Set<String> set = new HashSet() ;
        set.add("SAI"); //Line 1
        set.add("AMRIT"); //Line 2

        Map<String, String> hm = new HashMap<String, String>();
        //Line 1 Inter representation
        //hm.put(k,v)
        hm.put("SAI","PRESENT");
        //print map -> SAi-  present

        hm.put("SAI","NOT PRESENT");

        //print map -> SAi- not present

        hm.put("AMRIT","PRESENT");



        Consumer<String> toUpper = new Consumer<String>()
        {
            @Override
            public void accept(String t)
            {
                System.out.println(t.toUpperCase());
            }
        };
        gamesList.forEach(toUpper);

        UserConsumer<Set<String>> userConsumer = new UserConsumer<Set<String>>() {
            @Override
            public void accept(Set<String> setData) {
                if(setData.contains("SHRUTI")){
                    System.out.println("Hey!!! This is Me");
                }
            }
        };

        Set<String> stringSet = new HashSet<>();
        stringSet.add("SHRUTI");
        stringSet.add("PALASH");
        stringSet.add("AMRIT");
        stringSet.add("AMEY");

        Set<Set<String>> setData = new HashSet<>();
        setData.add(stringSet);

        setData.forEach(userConsumer);



    }
}
