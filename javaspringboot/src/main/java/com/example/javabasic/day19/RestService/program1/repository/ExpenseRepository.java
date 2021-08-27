package com.example.javabasic.day19.RestService.program1.repository;

import java.util.List;

import com.example.javabasic.day19.RestService.program1.model.Expense;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
 
public interface ExpenseRepository extends CrudRepository<Expense, Long> {
     
    public List<Expense> findByItem(String item);
     
    @Query(value = "SELECT * FROM Expense e WHERE e.amount >= :amount",
    nativeQuery = true)
    public List<Expense> listItemsWithPriceOver(@Param("amount") float amount);
}
