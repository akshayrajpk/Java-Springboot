package com.example.javabasic.day2.interfaceDemo.functionalInterfaceDemo5;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class BiggerThanFive<E> implements Predicate<Integer> {

    @Override
    public boolean test(Integer v) {

        Integer five = 5;
        //System.out.println("Input number = "+v);
        //System.out.println("Result => " + (v > five));
       // System.out.println("------------------");

        return v > five;
    }
}

public class JavaPredicateEx {

    public static void main(String[] args) {

        List<Integer> nums =
   Arrays.asList(2, 3, 1, 5, 6, 7, 8, 9, 12);

        BiggerThanFive<Integer> btf =
                new BiggerThanFive<>();

        //Clean code
        nums.stream().filter(btf).forEach(System.out::println);

        //Old style
        for(Integer in : nums){
            if(btf.test(in)){
                System.out.println("Numbers Greater than 5 =>"+in);
            }

        }

    }
}
