package com.powernode.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;

/**
 * packageName com.powernode.spring6.service
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className LogAspect
 * @date 2024/6/14
 * @description TODO
 */
@Component
@Aspect//切面类需要使用Aspect注解进行标注
@Order(2)
public class LogAspect {//切面
    //切面=通知+切点
    //@Before注解就是一个前置通知

    @Before("execution(* com.powernode.spring6.service..*(..))")
    public void beforeAdvice(){
        System.out.println("前置通知");
    }
    //后置通知
    @AfterReturning("execution(* com.powernode.spring6.service..*(..))")
    public void afterReturningAdvice(){
        System.out.println("后置通知");
    }
    //环绕通知(环绕是最大的通知，在前置之前，在后置之后。也在最终通知之后)
    @Around("execution(* com.powernode.spring6.service..*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
        //前面的代码
        System.out.println("前环绕");

        joinPoint.proceed();//执行目标
        //后面的代码
        System.out.println("后环绕");
    }
    //异常通知
    //最终通知
    @After("execution(* com.powernode.spring6.service..*(..))")
    public void afterAdvice(){
        System.out.println("最终通知");
    }
}