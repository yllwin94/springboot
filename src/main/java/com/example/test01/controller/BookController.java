package com.example.test01.controller;

import com.example.test01.model.Book;
import com.example.test01.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tip", "第一个SpringBoot应用");
        return "hello";//逻辑视图名 hello
    }

    @GetMapping("/book")
    @ResponseBody //该方法是一个RESTful API，该方法的返回值得直接作为响应
    public ResponseEntity<Map<String, String>> book() {
        return new ResponseEntity<>(Map.of("name", "疯狂讲义", "price", "119"), HttpStatus.OK);
    }

    @PostMapping("/addBook")
    public String addBook(Book book, Model model) {
        bookService.addBook(book);
        return "redirect:listBooks";
    }

    @GetMapping("/listBooks")
    public String list(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "list";
    }

    @GetMapping("/deleteBook")
    public String delete(Integer id) {
        bookService.deleteBook(id);
        return "redirect:listBooks";
    }

    @GetMapping("/rest")
    @ResponseBody //该方法是一个RESTful API，该方法的返回值得直接作为响应
    public ResponseEntity restIndex() {
        return new ResponseEntity<>("欢迎访问第一个spring boot应用", null, HttpStatus.OK);
    }

    @PostMapping("/rest/books")
    @ResponseBody
    public ResponseEntity<Map<String, String>> restAddBook(@RequestBody Book book) {
        bookService.addBook(book);
        return new ResponseEntity<>(Map.of("tip", "添加成功"), null, HttpStatus.OK);
    }

    @GetMapping("/rest/books")
    @ResponseBody
    public ResponseEntity<List<Book>> restList() {
        return new ResponseEntity<>(bookService.getAllBooks(), null, HttpStatus.OK);
    }

    @DeleteMapping("/rest/books/{id}")
    @ResponseBody
    public ResponseEntity<Map<String, String>> restDelete(@PathVariable Integer id) {
        bookService.deleteBook(id);
        return new ResponseEntity<>(Map.of("tip", "删除成功"), null, HttpStatus.OK);
    }
}
