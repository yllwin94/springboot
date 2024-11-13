package com.example.demo;

//单元测试：启用一个真实的web服务器

import com.example.demo.model.BookInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;
import java.util.Map;

/**
 *@SpringBootTest:用于修饰单元测试用例
 *webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT
 *web环境属性为WebEnvironment.RANDOM_PORT，表示在运行测试时，启动一个真实的web服务器
 *补充：
 *WebEnvironment.DEFINED_PORT，表示在运行测试时，启动一个真实的web服务器
 *WebEnvironment.MOCK,表示在运行测试时，启动一个模拟的web服务器
 *@Test和@ParameterizedTest：修饰测试用例的测试方法
 *@ParameterizedTest：JUnit5.x新增的测试注解，用于表示参数化测试，JUnit5.x会根据@ValueSource、
 *@CsvSource提供的参数来调用参数来调用参数化测试方法
 */
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RandomPortTest {

    @Autowired
    private TestRestTemplate restTemplate;

    /**
     * 测试：Restful接口的API是否能连通
     */
    @Test
    public void testRestIndex(){
        var result= restTemplate.getForObject("/rest", String.class);
        Assertions.assertEquals("欢迎访问第一个spring boot应用", result);
    }

    /**
     * 测试：添加功能是否正常
     */
    @ParameterizedTest
    @CsvSource({"水浒传,施耐庵,54", "红楼梦,曹雪芹,56"})
    public void testRestAddBook(String title, String author, double price){
        BookInfo book = new BookInfo(title, author, price);
        var result = restTemplate.postForObject("/rest/books", book, Map.class);
        Assertions.assertEquals(result.get("tip"), "添加成功");
    }

    /**
     * 测试：列表查询是否正常
     */
    @Test
    public void testRestList(){
        var result = restTemplate.getForObject("", List.class);
        result.forEach(System.out::println);
    }

    /**
     * 测试：删除功能是否正常
     * @param id
     */
    @ParameterizedTest
    @ValueSource(longs = {12, 13})
    public void testRestDelete(Long id){
        restTemplate.delete("/rest/books/{0}", id);
    }

}
