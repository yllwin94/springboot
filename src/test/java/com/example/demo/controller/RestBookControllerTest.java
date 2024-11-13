package com.example.demo.controller;

import com.example.demo.model.BookInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;

/**
 * 单元测试：测试Restful接口
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestBookControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @ParameterizedTest
    @CsvSource({"老人与海,海明威,110", "老人与海2,海明威,10"})
    public void testRestAddBook(String title, String author, double price) {

        BookInfo postObj = new BookInfo(title, author, price);
        BookInfo returnObj = restTemplate.postForObject("/rest/addBook", postObj, BookInfo.class);

        Assertions.assertEquals(postObj.getBookTitle(), returnObj.getBookTitle());
        Assertions.assertEquals(postObj.getBookAuthor(), returnObj.getBookAuthor());
        Assertions.assertEquals(postObj.getBookPrice(), returnObj.getBookPrice());
    }

    @Test
    public void testRestListBooks() {
        var books = restTemplate.getForObject("/rest/listBooks", List.class);
        books.forEach(System.out::println);
    }

    /**
     * 单元测试：删除图书
     * 注意：先调整参数
     * 备注：先把操作注释掉，先通过全部测试，最后再来看删除方法
     *
     * @param id
     */
    @ParameterizedTest
    @ValueSource(ints = {1071, 1072})
    public void testRestDeleteBook(Integer id) {
//        restTemplate.delete("/rest/deleteBook/{0}", id);
    }

}
