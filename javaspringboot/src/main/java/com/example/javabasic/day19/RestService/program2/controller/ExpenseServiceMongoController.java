package com.example.javabasic.day19.RestService.program2.controller;

import com.example.javabasic.day19.RestService.program2.model.Expense;
import com.example.javabasic.day19.RestService.program2.repository.ExpenseMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseServiceMongoController {
    @Autowired
    ExpenseMongoRepository expenseMongoRepository;

    @PostMapping("/expenses/mongo")
    public ResponseEntity<Object> createProduct(@RequestBody Expense expense) {
        Expense exp= expenseMongoRepository.save(expense);

        return new ResponseEntity<>("New Expense is created successfully .Expense Id = "+exp.getId(),
                HttpStatus.CREATED);
    }
}
