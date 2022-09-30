package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/20 14:38
 * @Description:
 */

@Repository
public class BookDaoImpl implements BookDao {

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        //1 创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        //2 调用方法
        Object[] args = {book.getUserId(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);

    }

    @Override
    public void deleteBook(String id) {
        String sql = "delete from t_book where user_id = ?";
        int delete = jdbcTemplate.update(sql, id);
        System.out.println(delete);
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set username = ?,ustatus=? where user_id = ?";
        Object[] args = {book.getUsername(), book.getUstatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void selectCount() {
        String sql = "select count(*) from t_book";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
    }

    @Override
    public void selectByUser_id(String id) {
        String username = "java";
        String sql = "select * from t_book where user_id = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        System.out.println(book);
    }

    @Override
    public void selectAll() {
        String sql = "select * from t_book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
        System.out.println(books);
    }

    @Override
    public void selectAllByUsername(String username) {
        String sql = "select * from t_book where username = ?";
        List<Book> books = jdbcTemplate.query(sql, new Object[]{username}, new BeanPropertyRowMapper<>(Book.class));
        List<Book> books1 = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class), username);
        System.out.println(books);
        System.out.println(books1);
    }
}
