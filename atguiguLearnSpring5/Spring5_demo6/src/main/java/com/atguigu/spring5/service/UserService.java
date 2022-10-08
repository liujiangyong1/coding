package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/22 13:51
 * @Description:
 */
@Service
//@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = false)
@Transactional
public class UserService {


    @Autowired
    private UserDao userDao;

    public void accountMoney() {

//        try {
//            //1.开启事务
//            //2.编写业务逻辑
        userDao.addMoney();
        int i = 10 / 0;
        userDao.reduceMoney();
//            //3.没有发生异常，提交事务
//        } catch (Exception e) {
//            //4.发生异常，事务回滚
//            e.printStackTrace();
//        }
    }
}
