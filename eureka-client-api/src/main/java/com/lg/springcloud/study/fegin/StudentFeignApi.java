package com.lg.springcloud.study.fegin;

import com.lg.springcloud.study.fegin.exception.StudentClientFallbackFactory;
import com.lg.springcloud.study.fegin.fallback.StudentClientFallback;
import com.lg.springcloud.study.fegin.interceptor.CustomRequestInterceptor;
import com.lg.springcloud.study.request.StudentRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 发生优先顺序:
 *  统一异常处理 >  fallback = StudentClientFallback.class > fallbackFactory = StudentClientFallbackFactory.class
 */
//@FeignClient(value = "eureka-client-provider", configuration = CustomRequestInterceptor.class,fallback = StudentClientFallback.class, fallbackFactory = StudentClientFallbackFactory.class)
@FeignClient(value = "eureka-client-provider", configuration = CustomRequestInterceptor.class)
public interface StudentFeignApi {

    @GetMapping("/student/name")
    String getStudentName(@SpringQueryMap StudentRequest request);
}
