package com.lg.springcloud.study.fegin;

import com.lg.springcloud.study.fegin.fallback.StudentClientFallback;
import com.lg.springcloud.study.request.StudentRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-provider", fallback = StudentClientFallback.class)
public interface StudentFeignApi {

    @GetMapping("/student/name")
    String getStudentName(@SpringQueryMap StudentRequest request);
}
