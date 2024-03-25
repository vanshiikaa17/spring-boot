package com.springboot.rest.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.rest.Entities.Book;

public interface BookRepo extends CrudRepository<Book, Integer>{
    
    
}
