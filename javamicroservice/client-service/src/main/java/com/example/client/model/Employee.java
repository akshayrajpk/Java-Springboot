package com.example.client.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="first_name" )
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "salary")
    private float salary;
}
