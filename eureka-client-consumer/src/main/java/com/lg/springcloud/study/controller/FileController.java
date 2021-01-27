package com.lg.springcloud.study.controller;

import com.lg.springcloud.study.response.RespData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping("file")
@RestController
public class FileController {

    @PostMapping("upload")
    public RespData<String> upload(@RequestParam("file") MultipartFile[] files) {
        String path = "E:\\upload\\other";
        for (MultipartFile file : files) {
            String fileFullName = file.getOriginalFilename();
            File saveFile = new File( path + File.separator + fileFullName);
            try {
                file.transferTo(saveFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return RespData.buildSuccess("success");
    }

}
