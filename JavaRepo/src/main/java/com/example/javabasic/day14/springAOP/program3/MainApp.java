package com.example.javabasic.day14.springAOP.program3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      //ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      /*ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:Beans.xml");
      ApplicationContext contextFile = new FileSystemXmlApplicationContext("classpath*:Beans.xml");
      */
      ApplicationContext context =
              new ClassPathXmlApplicationContext("AopBeans.xml");
      //Logging logging = (Logging) context.getBean("logging");
      Logging logging1 = (Logging) context.getBean("logging");
      Student student = (Student) context.getBean("student");
      student.getName();///Step 1 -> Before Advice -> After Advice -> After Return Advice
      student.getAge(); // Step 2 -> Before Advice -> After Advice -> After Return Advice
      
      student.printThrowException(); // Step 31 -> Before Advice -> After Advice -> After Return Advice
   }
}
