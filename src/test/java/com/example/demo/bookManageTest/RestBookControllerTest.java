package com.example.demo.bookManageTest;

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

    @ParameterizedTest
    @ValueSource(ints = {1031, 1032, 1039})
    public void testDeleteBook(Integer id) {
        restTemplate.delete("/rest/deleteBook/{0}", id);
    }

    @Test
    public void testListBooks() {
        var books = restTemplate.getForObject("/rest/listBooks", List.class);
        books.forEach(System.out::println);
    }

}
