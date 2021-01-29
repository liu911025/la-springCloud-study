package com.lg.springcloud.study.client;

import com.lg.springcloud.study.fegin.StudentFeignApi;
import com.lg.springcloud.study.request.StudentRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentFeignClient implements StudentFeignApi {

    @Value("${server.port}")
    private String port;
    @Override
    public String getStudentName(StudentRequest request) {
        //int i = 3 / 0;
        /*try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return request.getName();*/
        return port;
    }
}
