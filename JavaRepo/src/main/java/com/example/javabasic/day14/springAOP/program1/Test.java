package com.example.javabasic.day14.springAOP.program1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aopApplicationContext.xml");
        AOPProgram1 a = (AOPProgram1) context.getBean("proxy");

        a.m();
    }
}  
