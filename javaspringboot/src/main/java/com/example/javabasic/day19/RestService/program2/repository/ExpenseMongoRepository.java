package com.example.javabasic.day19.RestService.program2.repository;

import com.example.javabasic.day19.RestService.program2.model.Expense;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExpenseMongoRepository extends MongoRepository<Expense, Long> {

}
