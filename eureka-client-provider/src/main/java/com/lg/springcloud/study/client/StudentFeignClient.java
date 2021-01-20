package com.lg.springcloud.study.client;

import com.lg.springcloud.study.fegin.StudentFeignApi;
import com.lg.springcloud.study.request.StudentRequest;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentFeignClient implements StudentFeignApi {

    @Override
    public String getStudentName(StudentRequest request) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return request.getName();
    }
}
