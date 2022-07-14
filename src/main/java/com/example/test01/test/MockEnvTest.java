package com.example.test01.test;

import com.example.test01.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.net.URI;
import java.util.List;
import java.util.Map;

//模拟web环境测试控制器（controller）

/**
 * RANDOM_PORT、DEFINED_PORT是用来测试RESTful接口
 * MockMvc：如果想测试普通的控制器处理方法，比如读取处理方法返回的ModelAndView
 * AutoConfigureMockMvc：启动 MockMvc 的自动配置，这样spring boot会在容器中自动配置一个MockMvc Bean
 * 使用MockMvc执行测试方法的步骤：
 * 1. 使用MockMvcRequestBuilders的get()、post()、put()、patch()、delete()、options()、head()等方法创建对应的请求：
 *    如果需求设置请求参数、请求头等，则接着调用MockHttpServletRequestBuilder的param()、header()等方法；
 * 2. 调用MockMvc对象的perform()方法执行请求。
 *    MockMvc的perform()方法返回ResultActions，通过该对象的返回值可读取到控制器处理方法的ModelAndView，还可通过getResponse()
 *    获取控制器处理方法返回的响应，具体读取哪种信息根据测试需求决定，本测试用例主要读取控制器处理方法返回的ModelAndView。
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class MockEnvTest {

    @Autowired
    private MockMvc mvc;

    /**
     * 测试index方法
     * @throws Exception
     */
    @Test
    public void testIndex() throws Exception {
        var result = mvc.perform(MockMvcRequestBuilders.get(new URI("/"))).andReturn().getModelAndView();
        Assertions.assertEquals(Map.of("tip", "第一个SpringBoot应用"), result.getModel());
        Assertions.assertEquals("hello", result.getViewName());
    }

    /**
     * 测试addBook方法
     * @param title
     * @param author
     * @param price
     * @throws Exception
     */
    @ParameterizedTest
    @CsvSource({"it's our ship,lily.Yin,100", "nothing is impossible,lily.Yin,300"})
    public void testAddBook(String title, String author, double price) throws Exception {
        var result = mvc.perform(MockMvcRequestBuilders.post(new URI("/addBook")).param("title",title).param("author",author).param("price",price+"")).andReturn().getModelAndView();
        Assertions.assertEquals("redirect:listBooks", result.getViewName());
    }

    /**
     * 测试list方法
     * @throws Exception
     */
    @Test
    public void testList() throws Exception {
        var result = mvc.perform(MockMvcRequestBuilders.get(new URI("/listBooks"))).andReturn().getModelAndView();
        Assertions.assertEquals("list", result.getViewName());
        List<Book> books = (List<Book>)result.getModel().get("books");
        books.forEach(System.out::println);
    }

    /**
     * 测试delete方法
     * @param id
     * @throws Exception
     */
    @ParameterizedTest
    @ValueSource(ints = {15, 16})
    public void testDelete(Integer id) throws Exception {
        var result = mvc.perform(MockMvcRequestBuilders.get("/deleteBook?id={0}", id)).andReturn().getModelAndView();
        Assertions.assertEquals("redirect:listBooks", result.getViewName());
    }

}
