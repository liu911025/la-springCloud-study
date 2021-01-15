package com.lg.springcloud.study;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("spring.user")
public class UserProperties {

    private String name;
}
