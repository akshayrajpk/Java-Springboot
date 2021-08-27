package com.example.javabasic.day6.methodReference.program4;
import java.util.function.BiFunction;
/*override static methods by referring methods*/
class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
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

    public static Integer stringCount(String s1 ,String s2){
        return s1.length();
    }
}

public class MethodReference4 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
        BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
        BiFunction<Float, Float, Float> adder3 = Arithmetic::add;
        int result1 = adder1.apply(10, 20);
        float result2 = adder2.apply(10, 20.0f);
        float result3 = adder3.apply(10.0f, 20.0f);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("=======STRING DEMO========");

        BiFunction<String,String,String> strBifunction = Arithmetic::concatenate;
        String strResult = strBifunction.apply("MUM","BAI");
        System.out.println(strResult);

        BiFunction<String,String,Integer> strBifunction2 = Arithmetic::stringCount;
        Integer strResult1 = strBifunction2.apply("MUMBAI","");
        System.out.println("Length:"+strResult1);
    }
}
