package com.departmentservice.department.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name ="id" )
    private int id;
    @Column(name ="department_name")
    private String departmentName;
}
