package com.example.test01.service;

import com.example.test01.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    Integer addBook(Book book);
    void deleteBook(Integer id);

}
