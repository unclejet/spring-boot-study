package com.uj.study.filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/2 上午11:57
 * @description：
 */
@RestController
public class TokenController {

    @GetMapping("/getToken/{name}")
    public String get(@PathVariable("name") String name)  {
        return JwtUtil.generateToken(name);
    }

}

