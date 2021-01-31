package org.example.controller;


import org.example.exception.AppException;
import org.example.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/arg")
public class TestArgumentController {
    private static final Logger log = LoggerFactory.getLogger(TestArgumentController.class);

    @GetMapping("/holiday/{day}")
    public Object holiday(@PathVariable String day){
        log.debug("获取到请求路径参数: "+day);
        Map<String,Object> map = new HashMap<>();
        map.put("ok", true);
        return map;
    }
    @PostMapping("/login")
    public Object login(@RequestParam String userName, @RequestParam String passWord){
        log.debug("获取到的请求路径参数：username={}, password={}", userName, passWord);
        Map<String,Object> map = new HashMap<>();
        map.put("ok", true);
        return map;
    }
    @PostMapping("/login2")
    public Object login2(@RequestParam (required = false)int i){
        log.debug("获取到的请求路径参数：i="+i);
        Map<String,Object> map = new HashMap<>();
        map.put("ok", true);
        return map;
    }
    @PostMapping("/register")
    public Object register(@RequestParam String username,
                         @RequestParam String password,
                         @RequestPart MultipartFile file) throws IOException {
        log.debug("获取到的请求路径参数：username={}, password={}", username, password);
        log.debug("头像信息，名称={},内容={}", file.getOriginalFilename(), new String(file.getBytes()));
        Map<String,Object> map = new HashMap<>();
        map.put("ok", true);
        return map;
    }

    /**
     * springMvc自动实例化user对象，根据请求key获取值，注入到user对象的属性中
     * @param user
     * @return
     */
    @PostMapping("/login/pojo")
    public Object loginPojo(User user){
        log.debug("获取到的请求路径参数：username={}, password={}",
                user.getUserName(), user.getPassWord());
        Map<String,Object> map = new HashMap<>();
        map.put("ok", true);
        return map;
    }
    @PostMapping("/register/pojo")
    public Object register1(User user, MultipartFile file) throws IOException {
        log.debug("获取到的请求路径参数：username={}, password={}", user.getUserName(), user.getPassWord());
        log.debug("头像信息，名称={},内容={}", file.getOriginalFilename(), new String(file.getBytes()));
        Map<String,Object> map = new HashMap<>();
        map.put("ok", true);
        return map;
    }
    @PostMapping("/json")
    public Object json(@RequestBody User user){
        log.debug("用户信息为："+user);
        Map<String, Object> map = new HashMap<>();
        map.put("ok", true);
        return map;
    }

    @PostMapping("/file")
    public Object file(@RequestPart MultipartFile file) throws IOException {
        log.debug("头像信息，名称={}，内容={}", file.getOriginalFilename(),
                new String(file.getBytes()));
        Map<String, Object> map = new HashMap<>();
        map.put("ok", true);
        return map;
    }


    @GetMapping("/ex")
    public Object exception(Integer i){//模拟用户登录出错的问题
        if(i==1){//用户名密码不通过
            throw new AppException("Login001", "用户名或密码错误");
        }else{//用户名密码登录称共，但自己写的代码有bug，出现运行时异常
            int x = i/0;
        }
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三");
        return map;
    }

}
