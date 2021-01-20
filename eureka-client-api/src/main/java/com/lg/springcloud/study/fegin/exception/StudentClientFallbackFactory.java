package com.lg.springcloud.study.fegin.exception;

import com.lg.springcloud.study.fegin.StudentFeignApi;
import com.lg.springcloud.study.request.StudentRequest;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class StudentClientFallbackFactory implements FallbackFactory<StudentFeignApi> {

    @Override
    public StudentFeignApi create(Throwable throwable) {

        return new StudentFeignApi() {
            @Override
            public String getStudentName(StudentRequest request) {
                return "StudentFeignApi.getStudentName异常...";
            }
        };
    }
}
