package com.lg.springcloud.study.fegin;

import com.lg.springcloud.study.request.StudentRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-provider")
public interface StudentFeignApi {

    @GetMapping("/student/name")
    public String getStudentName(@SpringQueryMap StudentRequest request);
}
