package org.example.controller;

import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

/**
 * @author: Wade
 * @create: 2021/1/26
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @Bean
    public User user1(){
        User user = new User();
        user.setUserName("Login");
        user.setPassWord("123");
        return user;
    }

    @Bean
    public User user2(){
        User user = new User();
        user.setUserName("Hex");
        user.setPassWord("234");
        return user;
    }
}
