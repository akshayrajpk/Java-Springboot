package com.example.javabasic.day14.springAOP.program2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test{  
    public static void main(String[] args){  

        ApplicationContext context =
                new ClassPathXmlApplicationContext("aopApplicationContext.xml");

        Operation e = (Operation) context.getBean("opBean");
        System.out.println("calling msg...");  
        e.msg();  
        System.out.println("calling m...");  
        e.m();  
        System.out.println("calling k...");  
        e.k();  
    }  
}  
