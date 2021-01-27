package com.lg.springcloud.study.service.impl;

import com.lg.springcloud.study.fegin.StudentFeignApi;
import com.lg.springcloud.study.request.StudentRequest;
import com.lg.springcloud.study.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentFeignApi studentFeignApi;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Override
    public String getStudentName(StudentRequest request) {
        return studentFeignApi.getStudentName(request);
    }
}
