package com.springboot.rest.Controllers;

import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.Entities.Book;
import com.springboot.rest.Services.BookService;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class BookContoller {
    
    @Autowired
    BookService bs= new BookService();
    // @RequestMapping(value="/booklist", method=RequestMethod.GET)
    @GetMapping("/booklist")
    // @ResponseBody
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> books=this.bs.getAllBooks();
        if(books.size()<=0) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(books);
    }
    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        Book b= bs.addBook(book);
        return b;
    }
}
