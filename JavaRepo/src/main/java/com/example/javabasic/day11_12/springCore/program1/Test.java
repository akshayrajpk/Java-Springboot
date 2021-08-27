package com.example.javabasic.day11_12.springCore.program1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(
                new ClassPathResource("/applicationContext.xml", Test.class));

        Student student = (Student) factory.getBean("studentbean");
        student.displayInfo();

        System.out.println("");
    }
}  
