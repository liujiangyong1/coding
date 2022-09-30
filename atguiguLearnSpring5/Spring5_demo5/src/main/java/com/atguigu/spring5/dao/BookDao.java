package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/20 14:38
 * @Description:
 */
public interface BookDao {
    void add(Book book);

    void deleteBook(String id);

    void updateBook(Book book);

    void selectCount();

    void selectByUser_id(String id);

    void selectAll();

    void selectAllByUsername(String username);
}
