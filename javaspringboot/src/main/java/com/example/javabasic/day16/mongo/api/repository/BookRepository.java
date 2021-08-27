package com.example.javabasic.day16.mongo.api.repository;

import com.example.javabasic.day16.mongo.api.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
