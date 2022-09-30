package com.atguigu.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/22 13:50
 * @Description:
 */

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update t_account set money = money + ? where id = ?";
        Object[] args = new Object[]{100,1};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("钱增加成功！" + update);
    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money - ? where id = ?";
        Object[] args = new Object[]{100, 2};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("钱减少成功！" + update);
    }
}
