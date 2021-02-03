package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAOP {

    @Pointcut("execution(* org.example.controller.TestArgumentController.*.*(..))")
    public void loginPointcut(){

    }
    //前置通知，传入切点方法名（）
    @Before("loginPointcut()")
    public void beforeRequest(){
        System.out.println("开始执行请求映射方法");
    }
    //后置通知
    @After("loginPointcut()")
    public void afterRequest(){
        System.out.println("请求映射方法执行完毕");
    }

    @AfterReturning
    public void afterRequestReturn(){
        System.out.println("请求映射方法返回");
    }

    @AfterThrowing
    public void afterRequestThrow(){
        System.out.println("请求映射方法抛异常");
    }
    @Around("loginPointcut()")
    public Object aroundRequest(ProceedingJoinPoint joinPoint){
        Object obj = null;
        try {
            //方法执行前可以加入前置逻辑
            System.out.println("Around前执行");
            obj = joinPoint.proceed();//目标方法执行
            System.out.println("Around后执行");
        }catch (Throwable e){
//            e.printStackTrace();
            System.err.println("Around捕获异常");
        }
        return obj;
    }
}
