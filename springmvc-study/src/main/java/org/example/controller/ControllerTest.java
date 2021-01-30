package org.example.controller;

import org.example.model.ResponseJSON;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class ControllerTest {
    @RequestMapping("/1")
    public String test1(){
        return "forward:/index.html";
//        return "";
    }
    @RequestMapping("/2")
    public  String test2(){
        return "redirect:/index.html";
    }

    @RequestMapping("/3")
    @ResponseBody
    public  String test3(){
        return "redirect:/index.html";
    }
    @RequestMapping("/4")
    @ResponseBody
    public Object test4(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "World");
        return map;
    }
    @RequestMapping("/5")
    @ResponseBody
    public Object test5(){
        ResponseJSON rj = new ResponseJSON();
        rj.setSuccess(false);
        rj.setCode("RJ 4041");
        rj.setMessage("无用信息");
        rj.setData(404);
        rj.setData(new Date());
        return rj;
    }
    @RequestMapping("/6")
    @ResponseBody
    public ResponseEntity test6(){
        ResponseJSON rj = new ResponseJSON();
        rj.setSuccess(false);
        rj.setCode("RJ 0001");
        rj.setMessage("未授权，不允许访问");
        rj.setData(new Date());
        return ResponseEntity.status(401).body(rj);
    }
    @RequestMapping("/7")
    @ResponseBody
    public String test7(){
        return null;
    }
    @RequestMapping("/8")
    @ResponseBody
    public Object test8(){
        return null;
    }

}
