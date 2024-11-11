package com.example.demo.dao;

import com.example.demo.model.BookInfo;
import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<BookInfo, Integer> {

}
