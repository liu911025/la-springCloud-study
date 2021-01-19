package com.lg.springcloud.study.controller;

import com.lg.springcloud.study.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public Object get() {
        /**
         * 此方式创建RestTemplate不能加@LoadBalanced注解,否则拦截器会拦截替换对应的服务名称IP,没有localhost的服务名称替换失败
         * User user = restTemplate.getForEntity("http://localhost:8081/user/get?id=1", User.class).getBody();
         */
        User user = restTemplate.getForEntity("http://eureka-client-provider/user/get?id=1", User.class).getBody();
        return user;
    }

}
