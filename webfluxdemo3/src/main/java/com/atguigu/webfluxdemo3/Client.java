package com.atguigu.webfluxdemo3;


import com.atguigu.webfluxdemo3.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/10/9 17:06
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //调用服务器地址
        WebClient webClient = WebClient.create("http://127.0.0.1:50145");

        //根据id查询
        String id = "1";
        User userResult = webClient.get().uri("/user/{id}", id)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(User.class)
                .block();

        System.out.println(userResult.getName());



        //查询所有
        Flux<User> results = webClient.get().uri("/user")
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(User.class);

        results.map(stu -> stu.getName())
                .buffer().doOnNext(System.out::println).blockFirst();

    }



}
