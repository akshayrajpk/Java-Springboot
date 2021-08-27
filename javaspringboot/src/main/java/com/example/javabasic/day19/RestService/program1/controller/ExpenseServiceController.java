package com.example.javabasic.day19.RestService.program1.controller;

import com.example.javabasic.day19.RestService.program1.model.Expense;
import com.example.javabasic.day19.RestService.program1.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ExpenseServiceController {
    @Autowired
    ExpenseRepository expenseRepository;

    @PostMapping("/expenses")
    public ResponseEntity<Object> createProduct(@RequestBody Expense expense) {
        Expense exp= expenseRepository.save(expense);//Step 1
        List<Expense> expenseList =  expenseRepository.listItemsWithPriceOver((float) 22 );
        System.out.println("########################################");
        System.out.println(expenseList);
        System.out.println("########################################");
        return new ResponseEntity<>("New Expense is created successfully .Expense Id = "+exp.getId(),
                HttpStatus.CREATED);
    }

    @GetMapping("/allExpenses")
    public ResponseEntity<Object> getAllExpense(){
        List<Expense> expList= (List<Expense>) expenseRepository.findAll();
        return new ResponseEntity<>("Expense List "+expList,
                HttpStatus.OK);

    }
}
