package org.example.controller;

import org.example.exception.AppException;
import org.example.model.ResponseJSON;
import org.example.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 返回ResponseJSON统一响应格式
     * @param user
     * @param req
     * @return
     */
    @RequestMapping("/login")
    @PostMapping
    public Object login(User user, HttpServletRequest req){
        ResponseJSON json = new ResponseJSON();
        if("abc".equals(user.getUserName())){
            //通过请求头Cookie：JSESSIONID=xxx，在服务端map中通过xxx查找session
            //找到session就返回，如果没有，创建一个
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            json.setSuccess(true);
        }else{
            json.setCode("USERLoginErr4041");
            json.setMessage("用户名密码校验失败");
        }
        return json;
    }

    //建议使用该写法
    @PostMapping("/login2")
    public Object login2(User user){
        if("bcd".equals(user.getUserName())){
            return user;
        }else {
            throw new AppException("ULG001", "用户名或密码错误");
        }
    }
}
