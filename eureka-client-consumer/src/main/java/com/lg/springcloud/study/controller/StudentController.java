package com.lg.springcloud.study.controller;

import com.lg.springcloud.study.request.StudentRequest;
import com.lg.springcloud.study.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("student")
@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/getName")
    public String getStudent() {
        StudentRequest request = new StudentRequest();
        request.setName("张三");
        request.setAge(18);
        return studentService.getStudentName(request);
    }

}
