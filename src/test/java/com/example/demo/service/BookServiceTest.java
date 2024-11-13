package com.example.demo.service;

import com.example.demo.model.BookInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author lily.Yin
 * @Date 2024/11/13 15:17
 * @description 单元测试：测试service组件
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class BookServiceTest {

    @Autowired
    private BookService bookService;


    @ParameterizedTest
    @MethodSource("getBooks")
    public void testAddBook(BookInfo bookInfo) {
        bookService.addBook(bookInfo);
    }

    @Test
    public void testGetAllBooks() {
        List<BookInfo> allBooks = bookService.getAllBooks();
        allBooks.forEach(b -> System.out.println(b.getBookId() + "--" + b.getBookAuthor() + "--" + b.getBookTitle() + "--" + b.getBookPrice()));

    }

    @ParameterizedTest
    @ValueSource(ints = {1077, 1078})
    public void deleteBook(Integer id) {
//        bookService.deleteBook(id);
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
