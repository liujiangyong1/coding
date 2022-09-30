package com.atguigu.spring5.test;

import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/20 18:38
 * @Description:
 */
public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1");
        book.setUsername("java");
        book.setUstatus("a");

//        bookService.addBook(book);
//        bookService.updateBook(book);
//        bookService.deleteBook("1");
//        bookService.selectCount();
//        bookService.selectByUser_id("2");
//        bookService.selectAll();
        bookService.selectAllByUsername("java");

    }
}
