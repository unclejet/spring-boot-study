package com.uj.study.book.feign.controller;

import com.uj.study.book.feign.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/28 上午9:15
 * @description：
 */
@RestController
public class HelloFeignController {

    @Autowired
    private HelloFeignService helloFeignService;

    // 服务消费者对位提供的服务
    @GetMapping(value = "/search/github")
    public String searchGithubRepoByStr(@RequestParam("str") String queryStr) {
        return helloFeignService.searchRepo(queryStr);
    }
}
