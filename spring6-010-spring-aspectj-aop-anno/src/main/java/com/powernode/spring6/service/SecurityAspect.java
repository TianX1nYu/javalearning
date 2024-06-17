package com.powernode.spring6.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * packageName com.powernode.spring6.service
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className SecurityAspect
 * @date 2024/6/17
 * @description TODO
 */
@Aspect
@Component
@Order(3)
public class SecurityAspect {//安全切面
    //通知+切点
    @Before("execution(* com.powernode.spring6.service..*(..))")
    public void beforeAdvice(){
        System.out.println("前置通知：安全");
    }
}