package com.example.javabasic.day2.interfaceDemo.Akshay.day4;

@FunctionalInterface
interface StringConcat {
    //String concat(String a, String b);
    int sum(int a, int b, int c);
    static int staticMethod(int arg){
        return arg*5;
    }
    static int staticMethod3(int arg){
        return arg+5;
    }
}

public class LambdaExercise {
    public static void main(String args[]) {
// lambda expression with multiple arguments
        StringConcat s = (str1, str2, param3) -> str1 + str2+param3;

        //System.out.println("Result: " + s.concat("Hello ", "World"));
        System.out.println("Result: " + s.sum(3,5,7));
        System.out.println("-----------------------");
        System.out.println("Static Result: "+ StringConcat.staticMethod(10));
        System.out.println("Static Result: "+ StringConcat.staticMethod3(10));
    }
}
