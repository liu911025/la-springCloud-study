package com.lg.springcloud.study;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({UserAutoConfig.class})
public @interface EnableUserClient {

}
