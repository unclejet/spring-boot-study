package com.uj.study.service;

import com.uj.study.service.impl.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/14 上午9:29
 * @description：
 */
@FeignClient(name = "sc-provider-service", fallback = UserServiceFallback.class)
public interface IUserService {

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String getUser(@RequestParam("username") String username);

}
