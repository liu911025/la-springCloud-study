package com.lg.springcloud.study.service;

import com.lg.springcloud.study.request.StudentRequest;

public interface IStudentService {

    String getStudentName(StudentRequest request);

}
