package com.example.javabasic.exercise.day6;

import java.util.function.BiFunction;

interface Messageable2 {
    Message2 getMessage(String msg1, String msg2);
}

class Message2 {

    Message2(String msg, String msg2) {
        System.out.println("I am in Constructor");
        System.out.println(msg + msg2);
    }
}


public class BifunctionExercise {
    static class MethordList {
        public static int add(int a, int b) {
            return a + b;
        }
        public static int sub(int a, int b) {
            return a - b;
        }
        public static int div(int a, int b) {
            return a / b;
        }
        public static int mul(int a, int b) {
            return a * b;
        }

        public static float add(int a, float b) {
            return a + b;
        }

        public static float add(float a, float b) {
            return a + b;
        }

        public static String concatenate(String s1, String s2){
            return s1.concat(s2);
        }
        public static String upper(String s1, String s2){
            return s1.toUpperCase();
        }
        public static String lower(String s1, String s2){
            return s1.toLowerCase();
        }
    }
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder1 = MethordList::add;
        int result1 = adder1.apply(10, 20);
        System.out.println(result1);
        BiFunction<Integer, Integer, Integer> sub1 = MethordList::sub;
        int result2 = sub1.apply(10, 20);
        System.out.println(result2);
        BiFunction<Integer, Integer, Integer> mul1 = MethordList::mul;
        int result3 = mul1.apply(10, 20);
        System.out.println(result3);
        BiFunction<Integer, Integer, Integer> div1 = MethordList::div;
        int result4 = div1.apply(20, 20);
        System.out.println(result4);

        BiFunction<String, String, String> concat = MethordList::concatenate;
        String concd = concat.apply("aei","ou");
        System.out.println(concd);
        BiFunction<String, String, String> upper = MethordList::upper;
        String upr = upper.apply("aei","ou");
        System.out.println(upr);
        BiFunction<String, String, String> lower = MethordList::lower;
        String low = lower.apply("ABC","ou");
        System.out.println(low);

        Messageable2 msgobj = Message2::new;
        msgobj.getMessage("ABC","DEF");
    }
}
