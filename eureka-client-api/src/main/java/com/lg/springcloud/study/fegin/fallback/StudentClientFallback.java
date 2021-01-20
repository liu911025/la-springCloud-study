package com.lg.springcloud.study.fegin.fallback;

import com.lg.springcloud.study.fegin.StudentFeignApi;
import com.lg.springcloud.study.request.StudentRequest;
import org.springframework.stereotype.Component;

@Component
public class StudentClientFallback implements StudentFeignApi {

    @Override
    public String getStudentName(StudentRequest request) {
        return "StudentClientFallback...";
    }
}
