package com.uj.study.controller;

import com.uj.study.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/6 上午9:11
 * @description：
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addUser(User user , HttpServletRequest request){
        String token=request.getHeader("oauthToken");
        return "hello,"+user.getName();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser( @RequestBody User user){
        return "hello,"+user.getName();
    }


}
