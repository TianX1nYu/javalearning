package com.powernode.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * packageName com.powernode.spring6.service
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className TransactionAspect
 * @date 2024/6/17
 * @description TODO
 */
@Component
@Aspect
public class TransactionAspect {
    @Around("execution(* com.powernode.spring6.service..*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint){
        //执行目标
        try {
            //前环绕
            System.out.println("开启事务");
            joinPoint.proceed();
            //后环绕
            System.out.println("提交事务");
        } catch (Throwable e){
            System.out.println("回滚事务");
            //e.printStackTrace();
        }
    }
}