package com.uj.study.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/7 上午9:31
 * @description：
 */
@RestController
public class FeignUploadController {

    @PostMapping(value = "/uploadFile/server", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileUploadServer(MultipartFile file ) throws Exception{
        System.out.println("unclejet: " + file.getOriginalFilename());
        return file.getOriginalFilename();
    }
}
