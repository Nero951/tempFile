package org.example.controller;

import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author: Wade
 * @create: 2021/1/26
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @Autowired
    @Qualifier("user1")
    public User user;
}
