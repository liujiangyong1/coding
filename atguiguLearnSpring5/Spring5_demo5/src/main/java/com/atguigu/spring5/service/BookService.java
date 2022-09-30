package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.BookDao;
import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/20 14:38
 * @Description:
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    //删除的方法
    public void deleteBook(String id) {
        bookDao.deleteBook(id);
    }

    //更新的方法
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    //查询返回一共含有多少记录
    public void selectCount(){
        bookDao.selectCount();
    }

    //查询得到一个对象
    public void selectByUser_id(String id) {
        bookDao.selectByUser_id(id);
    }

    public void selectAll() {
        bookDao.selectAll();
    }

    public void selectAllByUsername(String username) {
        bookDao.selectAllByUsername(username);
    }
}
