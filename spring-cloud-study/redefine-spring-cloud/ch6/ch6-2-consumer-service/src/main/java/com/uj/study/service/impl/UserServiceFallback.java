package com.uj.study.service.impl;

import com.uj.study.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/14 上午9:29
 * @description：
 */
@Component
public class UserServiceFallback implements IUserService {
    /**
     * 出错则调用该方法返回友好错误
     * @param username
     * @return
     */
    public String getUser(String username){
        return "The user does not exist in this system, please confirm username";
    }
}
