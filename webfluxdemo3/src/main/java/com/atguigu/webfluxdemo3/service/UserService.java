package com.atguigu.webfluxdemo3.service;


import com.atguigu.webfluxdemo3.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/10/9 10:37
 * @Description:
 */
//用户操作接口
public interface UserService {
    //根据id查询某个用户
    Mono<User> getUserById(int id);

    //查询得到所有用户
    Flux<User> getAllUser();

    //保存用户信息
    Mono<Void> saveUserInfo(Mono<User> user);

}
