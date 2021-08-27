package com.example.javabasic.day11_12.springCore.program1;

public class Student {
private String name;
private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
    return name;  
}  
  
public void setName(String name) {  
    this.name = name;  
}  
  
public void displayInfo(){  
    System.out.println("Hello: "+name);  
    System.out.println("Hello: "+age);
}
}
