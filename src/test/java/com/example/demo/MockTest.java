package com.example.demo;


import com.example.demo.dao.BookDao;
import com.example.demo.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 *避免不稳定因素影响单元测试的效果，可以使用Mock组件来模拟这些不稳定的组件，用于确保被测试组件代码的健壮性。
 *不稳定因素：
 *1.实际应用中组件可能需要依赖其他组件来访问数据库
 *2.调用第三方接口提供的服务
 *
 *以下案例，模拟的是DAO组件，DAO组件未开发，如果此时相对bookService组件进行测试，那就需要提供一个Mock组件来模拟BookDao。
 */
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MockTest {

    //定义要测试的目标组件：BookService
    @Autowired
    private BookService bookService;

//为BookService依赖的组件定义一个MockBean
//该MockBean将会被注入被测试的目标组件
    @MockBean
    private BookDao bookDao;

    @Test
    public void testGetAllBooks(){

    }

//    @Test
//    public void testAddBook(){
//        BookInfo bookInfo = new BookInfo("1", "1", 100);
//        BDDMockito.given(this.bookDao.save(bookInfo)).willReturn(new BookInfo("1", "1", 100));
//        Integer integer = bookService.addBook(bookInfo);
//        System.out.println(integer);
//    }



}
