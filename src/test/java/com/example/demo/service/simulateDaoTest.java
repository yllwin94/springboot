package com.example.demo.service;

import com.example.demo.dao.BookDao;
import com.example.demo.model.BookInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author lily.Yin
 * @Date 2024/11/13 16:00
 * @description 单元测试：测试service组件(模拟DAO组件还没完成时)
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class simulateDaoTest {

    @Autowired
    private BookService bookService;
    @MockBean
    private BookDao bookDao;


    @ParameterizedTest
    @MethodSource("getBooks")
    public void testAddBook(BookInfo bookInfo) {
        Integer borrow = 1111;
        BookInfo book = new BookInfo("中国近现代哲学史3", "冯友兰", 100);
        book.setBookId(borrow);
        BDDMockito.given(this.bookDao.save(bookInfo)).willReturn(book);
        //bookDao.save（）的返回值时BookInfo实体，所以用新建的实体book去模拟正式的返回值
        //bookDao.save（）的返回值的id就是1111
        Integer id = bookService.addBook(bookInfo);
        System.out.println(id);
        Assertions.assertEquals(borrow, id);

    }

    @Test
    public void testGetAllBooks() {
        BDDMockito.given(this.bookDao.findAll()).willReturn(List.of(
                new BookInfo("中国近现代哲学史", "冯友兰", 100),
                new BookInfo("中国近现代哲学史2", "冯友兰", 100))
        );
        List<BookInfo> books = bookService.getAllBooks();
        books.forEach(System.out::println);
        Assertions.assertEquals("中国近现代哲学史", books.get(0).getBookTitle());
        Assertions.assertEquals("冯友兰", books.get(0).getBookAuthor());
        Assertions.assertEquals("中国近现代哲学史2", books.get(1).getBookTitle());
        Assertions.assertEquals("冯友兰", books.get(1).getBookAuthor());

    }


    /**
     * 该方法负责生成测试数据
     * 该方法必须用static修饰，且返回值必须是stream类型
     */
    public static Stream<BookInfo> getBooks() {
        return Stream.<BookInfo>of(
                new BookInfo("中国近现代哲学史", "冯友兰", 100),
                new BookInfo("中国近现代哲学史2", "冯友兰", 100)
        );
    }

}
