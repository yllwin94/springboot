package com.example.test01.test;

import com.example.test01.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;
import java.util.Map;

//单元测试：启用一个真实的web服务器
/**
 * @ SpringBootTest:用于修饰单元测试用例
 *  webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
 *  web环境属性为WebEnvironment.RANDOM_PORT，表示在运行测试时，启动一个真实的web服务器
 *  补充：
 *      WebEnvironment.DEFINED_PORT，表示在运行测试时，启动一个真实的web服务器
 *      WebEnvironment.MOCK,表示在运行测试时，启动一个模拟的web服务器
 * @ Test 和 @ParameterizedTest：修饰测试用例的测试方法
 * @ ParameterizedTest ：JUnit5.x新增的测试注解，用于表示参数化测试，JUnit5.x会根据@ValueSource、
 * @ CsvSource 提供的参数来调用参数来调用参数化测试方法
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RandomPortTest {

    @Autowired
    private TestRestTemplate restTemplate;

    /**
     * 测试：RESTful接口的API是否能连通
     */
    @Test
    public void testRestIndex(){
        var result = restTemplate.getForObject("/rest", String.class);
        Assertions.assertEquals("欢迎访问第一个spring boot应用", result);
    }

    /**
     * 测试：添加功能是否正常
     */
    @ParameterizedTest
    @CsvSource({"水浒传,施耐庵,54", "红楼梦,曹雪芹,56"})
    public void testRestAddBook(String book_title, String book_author, double book_price){
        Book book = new Book(book_title, book_author, book_price);
        var result = restTemplate.postForObject("/rest/books", book, Map.class);
        Assertions.assertEquals(result.get("tip"),"添加成功");
    }

    /**
     * 测试：列表查询是否正常
     */
    @Test
    public void testRestList(){
        var result = restTemplate.getForObject("/rest/books", List.class);
        result.forEach(System.out::println);
    }

    /**
     * 测试：删除功能是否正常
     */
    @ParameterizedTest
    @ValueSource(ints = {12, 13})
    public void testRestDelete(Integer book_id){
        restTemplate.delete("/rest/books/{0}", book_id);
    }
}
