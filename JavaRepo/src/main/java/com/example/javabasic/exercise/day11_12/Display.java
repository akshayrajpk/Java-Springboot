package com.example.javabasic.exercise.day11_12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Display implements IDisplay{
    public void display(String msg){
        System.out.println("msg = " + msg);
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Employee employee = (Employee) context.getBean("employeeBean");
        employee.setField("Developer");
        System.out.println("Designation" + employee.getField());
        employee.setSalary(200.0F);
        System.out.println("Salary" + employee.getSalary());
    }
}
