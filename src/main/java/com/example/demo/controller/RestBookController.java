package com.example.demo.controller;


import com.example.demo.model.BookInfo;
import com.example.demo.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Restful接口
 * 这是利用restful组件来构建接口，作用于前后端分离，返回的是接口数据
 * model是在控制器和视图页面传递参数，作为接口传递数据，是不需要model的
 * 实现：前后端分离，后端只需要专注于后端开发，给前端提供restful接口
 * 代码解耦合、工作量减半，问题就是页面跳转都归前端来做了，前后端融汇贯通应该不太可能了
 * 效果就是专业的人只能在自己的领域专业，要涉及其他领域几乎没有施展的机会
 */
@Controller
public class RestBookController {

    //有参构造器，初始化创建BookService实体
    private BookService bookService;

    public RestBookController(BookService bookService) {
        this.bookService = bookService;
    }

    /**
     * Restful接口：添加图书
     *
     * @param bookInfo
     * @return
     */
    @PostMapping("/rest/addBook")
    @ResponseBody
    public ResponseEntity<BookInfo> addBook(@RequestBody BookInfo bookInfo) {
        if (bookService.addBook(bookInfo) > 0) {
            return new ResponseEntity<>(bookInfo, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

        }
    }

    /**
     * Restful接口：图书列表
     *
     * @return
     */
    @GetMapping("/rest/listBooks")
    @ResponseBody
    public ResponseEntity<List<BookInfo>> listBooks() {
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    /**
     * Restful接口：删除图书
     *
     * @param id
     * @return
     */
    @DeleteMapping("/rest/deleteBook/{id}")
    @ResponseBody
    public ResponseEntity<Integer> deleteBook(@PathVariable Integer id) {
        bookService.deleteBook(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }

}
