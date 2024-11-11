package com.example.demo.controller;

import com.example.demo.model.BookInfo;
import com.example.demo.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * requestMapping注解修饰方法映射不同url来实现http请求
 * 控制器与视图页面直接交互
 * 问题：前后端不分离，代码耦合冗余程度高，这样会导致项目体量大，不符合SOA架构，后期项目剥离以及架构升级难度大
 * 健壮性不够，查找问题麻烦。
 */
@Controller
public class BookController {

    //注入依赖方式有参构造器 替代 @Autowired注解
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /**
     * 访问主页
     *
     * @param model io
     * @return hello view
     */
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("tip", "第一个springboot项目");
        return "hello";
    }

    /**
     * Restful接口
     * @return
     */
    @GetMapping("/book")
    @ResponseBody
    public ResponseEntity<Map<String, String>> book() {
        return new ResponseEntity<>(Map.of("name", "lily's book", "price", "100"), HttpStatus.OK);
    }

    /**
     * 添加图书
     * 用的requestMapping注解来映射来自不用URL路径的http请求，model是用于返回视图元素
     */
    @PostMapping("/addBook")
    public String addBook(BookInfo bookInfo, Model model) {

        Integer id = bookService.addBook(bookInfo);
        try {
            if (id > 0) {
                return "redirect:/listBooks";
            } else {
                model.addAttribute("tip", "图书添加失败");
                return "hello";
            }
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("tip", "图书添加失败");
            return "hello";
        }
    }

    /**
     * 展示图书列表
     *
     * @param model
     * @return
     */
    @GetMapping("/listBooks")
    public String listBooks(Model model) {
        //查询系统中所有图书，并存入books属性中
        model.addAttribute("books", bookService.getAllBooks());
        return "list";//这是直接返回到view中
    }

    /**
     * 删除图书
     *
     */
    @DeleteMapping ("/deleteBook/{id}")
    public String deleteBook(@PathVariable Integer id) {
        System.out.println("id=" + id);
        bookService.deleteBook(id);
        return "redirect:/listBooks";//重定向的地址是到controller中的function中
    }

}
