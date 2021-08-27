package com.example.javabasic.Exercise.Day16;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {
    @Id
    private String id;
    private String studentName;
    private String studentAge;
    private String studentAddress;

    public  String getId()
    {
        return id;
    }
    public void setId(String id) {
        this.id=id;
    }

    public String getStudentName() {

        return studentName;
    }
    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }

    public String getStudentAge() {

        return studentAge;
    }
    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentAddress() {

        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) {

        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentAge='" + studentAge + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }

}
