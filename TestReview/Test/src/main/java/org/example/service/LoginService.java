package org.example.service;

import org.example.dao.LoginDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author: Wade
 */
@Service
@Scope("prototype")
public class LoginService {
    @Autowired
    private LoginDAO loginDAO;
}
