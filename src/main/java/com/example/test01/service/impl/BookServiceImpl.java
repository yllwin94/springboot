package com.example.test01.service.impl;

import com.example.test01.dao.BookDao;
import com.example.test01.model.Book;
import com.example.test01.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED, timeout = 5)
public class BookServiceImpl implements BookService {

    /**
     * 依赖注入容器中的BookDao组件
     */
    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getAllBooks() {
        return (List<Book>) bookDao.findAll();
    }

    @Override
    public Integer addBook(Book book) {
        bookDao.save(book);
        return book.getId();
    }

    @Override
    public void deleteBook(Integer id) {
        bookDao.deleteById(id);
    }
}
