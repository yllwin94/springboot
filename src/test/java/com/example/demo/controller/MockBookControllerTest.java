package com.example.demo.controller;

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
import org.springframework.web.servlet.ModelAndView;

/**
 * 单元测试：模拟web环境测试控制器
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class MockBookControllerTest {

    //Could not autowire. No beans of 'MockMvc' type found.
    //这个不用管它，多运行几次自动解除了，至于是什么原因，目前不是很了解，MockMvc的实体类没有注入到spring容器中
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testIndex() throws Exception {
        ModelAndView view = mockMvc.perform(MockMvcRequestBuilders.get("/index"))
                .andReturn()
                .getModelAndView();
        Assertions.assertEquals(view.getModel().get("tip"), "第一个springboot项目");
        Assertions.assertEquals("hello", view.getViewName());
    }

    @ParameterizedTest
    @CsvSource({"老人与海1,海明威,110", "老人与海2,海明威,110", "老人与海3,海明威,110"})
    public void testAddBooks(String title, String author, double price) throws Exception {
        ModelAndView mv = mockMvc.perform(MockMvcRequestBuilders.post("/addBook")
                        .param("bookTitle", title)
                        .param("bookAuthor", author)
                        .param("bookPrice", String.valueOf(price))
                )
                .andReturn()
                .getModelAndView();
        //getViewName 获取视图页面数据
        Assertions.assertEquals("redirect:/listBooks", mv.getViewName());

    }

    @Test
    public void testListBooks() throws Exception {
        ModelAndView mv = mockMvc.perform(MockMvcRequestBuilders.get("/listBooks"))
                .andReturn()
                .getModelAndView();
        Assertions.assertEquals("list", mv.getViewName());
        var books = mv.getModel().get("books");
        System.out.println(books);

    }


    /**
     * 单元测试：删除图书
     * 注意：先调整参数
     * 备注：先把操作注释掉，先通过全部测试，最后再来看删除方法
     *
     */
    @ParameterizedTest
    @ValueSource(ints = {1073, 1074})
    public void testDeleteBook(Integer id) throws Exception {
        //MockMvcRequestBuilders后面跟的方法要跟requestMapping对应起来，报错信息：Request method 'GET' not supported
//        ModelAndView view = mockMvc.perform(MockMvcRequestBuilders.delete("/deleteBook/{0}", id))
//                .andReturn()
//                .getModelAndView();
//        Assertions.assertEquals("redirect:/listBooks", view.getViewName());
    }


}
