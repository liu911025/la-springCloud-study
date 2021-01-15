package com.lg.springcloud.study.controller;

import com.lg.springcloud.study.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("getName")
    public String getName() {
        String name = userClient.getName();
        //String name = "123";
        System.out.println(name);
        return name;
    }
}
