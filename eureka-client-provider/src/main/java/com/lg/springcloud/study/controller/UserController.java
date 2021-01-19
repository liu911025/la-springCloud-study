package com.lg.springcloud.study.controller;

import com.lg.springcloud.study.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @GetMapping("get")
    public User getUser(int id) {
        return new User(id, "yinjihuan");
    }

}
