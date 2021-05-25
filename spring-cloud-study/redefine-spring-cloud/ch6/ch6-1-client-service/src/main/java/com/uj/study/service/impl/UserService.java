package com.uj.study.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.uj.study.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/13 上午9:13
 * @description：
 */
@Component
public class UserService implements IUserService {

    @Override
    @HystrixCommand(fallbackMethod="defaultUser")
    public String getUser(String username) throws Exception {
        if(username.equals("spring")) {
            return "This is real user";
        }else {
            throw new Exception();
        }
    }

    /**
     * 出错则调用该方法返回友好错误
     * @param username
     * @return
     */
    public String defaultUser(String username) {
        return "The user does not exist in this system";
    }

}
