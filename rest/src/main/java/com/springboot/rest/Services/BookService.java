package com.springboot.rest.Services;

// import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.Entities.Book;
import com.springboot.rest.dao.BookRepo;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;
    // private static List<Book> list=new ArrayList<>();

    // static{
    //     list.add(new Book(444, "Harry Potter and the goblet of fire", "J.K.Rowling"));
    //     list.add(new Book(897, "Fault in our stars", "John Green"));
    //     list.add(new Book(788, "And then there were none", "Agatha Cristie"));
    // }

    public List <Book> getAllBooks(){
        return (List<Book>)bookRepo.findAll();
    }

    public Book addBook(Book book){
        Book result=bookRepo.save(book);
        return result;
    }
}
