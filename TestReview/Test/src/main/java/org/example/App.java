package org.example;

import org.example.controller.LoginController;
import org.example.dao.LoginDAO;
import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Wade Winston Wilson
 */
public class App {
    public static void main(String[] args) {
        //根据Spring配置文件路径创建容器：应用上下文对象
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");
        //获取注册的bean对象：根据名称获取，或根据类型获取
        LoginController loginController = (LoginController)
                context.getBean("loginController");
        //获取service，DAO对象
        LoginService loginService = (LoginService) context.getBean("loginService");
        LoginDAO loginDAO = (LoginDAO) context.getBean("loginDAO");
        LoginService loginService1 = context.getBean(LoginService.class);
        User user1 = (User)context.getBean("user1");
        User user2 = (User)context.getBean("user2");
        User user3 = (User)context.getBean("userFactoryBean");
        //打印
        System.out.println(loginController);
        System.out.printf("loginService:%s%n",loginService==loginService1);
        System.out.println(loginDAO);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        //关闭容器
        ((ClassPathXmlApplicationContext) context).close();
    }
}