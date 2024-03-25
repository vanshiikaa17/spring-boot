package com.springboot.rest.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authId;
    private String firstname;
    private String lastname;

    @JsonBackReference
    @OneToOne(mappedBy = "author")
    private Book book;
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public int getAuthId() {
        return authId;
    }
    public Author() {
    }
    public void setAuthId(int authId) { 
        this.authId = authId;
    }
    public String getFirstname() {
        return firstname;
    }
    public Author(int authId, String firstname, String lastname, Book book) {
        this.authId = authId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.book=book;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
