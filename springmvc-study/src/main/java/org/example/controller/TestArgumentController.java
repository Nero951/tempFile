package org.example.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

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
        log.debug("获取到的请求路径参数：username="+userName, " password="+passWord);
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
    
}
