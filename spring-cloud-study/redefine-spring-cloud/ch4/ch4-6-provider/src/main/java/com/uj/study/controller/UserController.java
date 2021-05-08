package com.uj.study.controller;

import com.uj.study.model.User;
import com.uj.study.service.UserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/8 上午9:22
 * @description：
 */
@RestController
public class UserController implements UserService {

    @Override
    public String addUser(User user){
        return "hello,"+user.getName();
    }

    @Override
    public String updateUser(User user){
        return "hello,"+user.getName();
    }
}
