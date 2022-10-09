package com.atguigu.webfluxdemo3.handler;



import com.atguigu.webfluxdemo3.entity.User;
import com.atguigu.webfluxdemo3.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


import static org.springframework.web.reactive.function.BodyInserters.fromObject;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/10/9 14:11
 * @Description:
 */
public class UserHandler {
    private final UserService userService;

    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    //根据id查询
    public Mono<ServerResponse> getUserById(ServerRequest request){
        //获取id值
        Integer userId = Integer.valueOf(request.pathVariable("id"));
        //空值处理
        Mono<ServerResponse> notFound = ServerResponse.notFound().build();

        //调用service方法得到数据
        Mono<User> userMono = userService.getUserById(userId);
        //把userMono进行转换返回
        //使用Reactor操作符flatMap
        return
                userMono
                        .flatMap(person -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                                .body(fromObject(person)))
                        .switchIfEmpty(notFound);
    }

    //查询所有
    public Mono<ServerResponse> getAllUsers(ServerRequest request){
        //调用service得到结果
        Flux<User> users = this.userService.getAllUser();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(users, User.class);
    }

    //添加
    public Mono<ServerResponse> saveUser(ServerRequest request) {
        Mono<User> userMono = request.bodyToMono(User.class);
        return ServerResponse.ok().build(this.userService.saveUserInfo(userMono));
    }


}
