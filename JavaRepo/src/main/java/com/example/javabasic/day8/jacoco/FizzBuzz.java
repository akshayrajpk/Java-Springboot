package com.example.javabasic.day8.jacoco;

public class FizzBuzz {

    public String getFizzBuzzWord(int number) {
        StringBuilder fizzBuzzWord = new StringBuilder();

        if (number % 3 == 0) {
            fizzBuzzWord.append("Fizz");
        }

        if (number % 5 == 0) {
            fizzBuzzWord.append("Buzz");
        }
        System.out.println("fizzBuzzWord -> "+fizzBuzzWord);
        return (fizzBuzzWord.length() == 0) ? null : fizzBuzzWord.toString();
    }
}
