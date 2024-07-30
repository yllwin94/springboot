package com.example.test01.test;

import com.example.test01.dao.BookDao;
import com.example.test01.model.Book;
import com.example.test01.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

/**
 * 避免不稳定因素影响单元测试的效果，可以使用Mock组件来模拟这些不稳定的组件，用于确保被测试组件代码的健壮性。
 * 不稳定因素：
 * 1.实际应用中组件可能需要依赖其他组件来访问数据库
 * 2.调用第三方接口提供的服务
 *
 * 以下案例，模拟的是DAO组件，DAO组件未开发，如果此时相对bookService组件进行测试，那就需要提供一个Mock组件来模拟BookDao。
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MockTest {

    //定义要测试的目标组件：BookService
    @Autowired
    private BookService bookService;

    //为BookService依赖的组件定义一个Mock Bean
    //该Mock Bean将会被注入被测试的目标组件
    @MockBean
    private BookDao bookDao;

    @Test
    public void testGetAllBooks(){
        // 模拟bookDao的findAll（）方法的返回值
        BDDMockito.given(this.bookDao.findAll()).willReturn(List.of(new Book("测试1", "李刚", 89.9), new Book("测试2", "yeeku", 99.9)));
        List<Book> result = bookService.getAllBooks();
        Assertions.assertEquals(result.get(0).getBook_title(), "测试1");
        Assertions.assertEquals(result.get(0).getBook_author(), "李刚");
        Assertions.assertEquals(result.get(1).getBook_title(), "测试2");
        Assertions.assertEquals(result.get(1).getBook_author(), "yeeku");
    }

}
