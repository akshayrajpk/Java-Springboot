package com.example.javabasic.day6.methodReference.program3;
import java.util.function.BiFunction;
/*using BiFunction interface and using it's apply() method*/

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
}

public class MethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add  = Arithmetic::add;
        BiFunction<Integer, Integer, Integer> sub = Arithmetic::sub;
        int result = add.apply(10, 20);
        System.out.println(result);
        System.out.println("================");
        int resultSub = sub.apply(70, 20);
        System.out.println(resultSub);
    }
}
