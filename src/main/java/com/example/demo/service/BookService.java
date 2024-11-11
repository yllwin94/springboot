package com.example.demo.service;


import com.example.demo.model.BookInfo;

import java.util.List;

public interface BookService {

    Integer addBook(BookInfo bookInfo);
    List<BookInfo> getAllBooks();
    void deleteBook(Integer id);

}
