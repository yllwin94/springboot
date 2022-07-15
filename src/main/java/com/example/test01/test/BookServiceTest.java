package com.example.test01.test;

import com.example.test01.model.Book;
import com.example.test01.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//测试业务组件
/**
 * 针对于控制器组件进行测试，是需要启动web服务器的；
 * 针对于Service组件或DAO组件是不需要启动web服务器的，所以webEnvironment = SpringBootTest.WebEnvironment.NONE
 *
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    /**
     * 测试：获取所有数据的功能是否正常
     */
    @Test
    public void testGetAllBooks(){
        bookService.getAllBooks().forEach(System.out::println);
    }

    /**
     * 测试：添加数据的功能是否正常
     * @param title
     * @param author
     * @param price
     */
    @ParameterizedTest
    @CsvSource({"疯狂Java讲义, 李刚, 129", "疯狂Java讲义2, 李刚, 138"})
    public void testAddBook(String title, String author, double price){
        var book = new Book(title, author, price);
        Integer result = bookService.addBook(book);
        System.out.println(result);
        Assertions.assertNotEquals(result, 0);
    }

    /**
     * 测试：删除数据的功能是否正常
     * @param id
     */
    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    public void testDeleteBook(Integer id){
        bookService.deleteBook(id);
    }


}
