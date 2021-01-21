package com.lg.springcloud.study.fegin.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.Collection;
import java.util.Map;


public class CustomRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        String url = template.url();
        System.out.println("url :" + url);
        Map<String, Collection<String>> headers = template.headers();
        for (String key : headers.keySet()) {
            System.out.println("key >>> " + key);
            Collection<String> values = headers.get(key);
            for (String val : values) {
                System.out.println("val >>> " + val);
            }
        }
    }
}
