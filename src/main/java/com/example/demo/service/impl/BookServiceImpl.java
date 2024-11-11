package com.example.demo.service.impl;

import com.example.demo.dao.BookDao;
import com.example.demo.model.BookInfo;
import com.example.demo.service.BookService;
import com.example.demo.utils.CommonMethod;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    //有参构造器
    private BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public Integer addBook(BookInfo bookInfo) {
        if (CommonMethod.elementsIsNull(bookInfo.getBookAuthor(), bookInfo.getBookTitle())) return 0;
        BookInfo save = bookDao.save(bookInfo);
        return save.getBookId();
    }

    @Override
    public List<BookInfo> getAllBooks() {
        return (List<BookInfo>) bookDao.findAll();
    }

    @Override
    public void deleteBook(Integer id) {
        bookDao.deleteById(id);
    }











}
