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
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new User(id, "yinjihuan");
    }

}
