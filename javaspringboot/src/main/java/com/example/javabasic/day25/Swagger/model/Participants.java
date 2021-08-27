package com.example.javabasic.day25.Swagger.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "participants")
public class Participants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "clas")
    private String clas;

    @Column(name = "category")
    private String category;


}
