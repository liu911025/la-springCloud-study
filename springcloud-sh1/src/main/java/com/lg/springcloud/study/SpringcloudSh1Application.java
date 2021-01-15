package com.lg.springcloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableUserClient
@SpringBootApplication
public class SpringcloudSh1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSh1Application.class, args);
    }

}
