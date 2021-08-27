package com.example.javabasic.day27.RestTemplate.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@ToString
@Getter
@Setter
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private float salary;
}
