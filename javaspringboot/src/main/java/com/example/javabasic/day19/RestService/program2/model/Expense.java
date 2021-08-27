package com.example.javabasic.day19.RestService.program2.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.lang.annotation.Documented;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "Expense")
public class Expense {
    @Id
    private Long id;
    private String item;
    private float amount;
}
