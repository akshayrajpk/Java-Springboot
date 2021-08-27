package com.example.javabasic.day15.springJDBC.program1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=
            new ClassPathXmlApplicationContext("jdbcApplicationContext.xml");
      
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
//    int status=dao.saveEmployee(new Employee(8,"BOND9",3000));
//    System.out.println(status);
//
    int status=dao.updateEmployee(new Employee(8,"Sonoo",15000));
    System.out.println(status);

          
    /*Employee e=new Employee(); 
    e.setId(102); 
    int status=dao.deleteEmployee(e); 
    System.out.println(status);*/  
      
}  
  
}
