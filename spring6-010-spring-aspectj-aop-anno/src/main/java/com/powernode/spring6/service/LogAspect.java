package com.powernode.spring6.service;

import org.aspectj.lang.JoinPoint;
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

    //定义通用切点
    @Pointcut("execution(* com.powernode.spring6.service..*(..))")
    public void generalPointCut(){
        //这个方法只是一个标记，方法名随意，方法中也不需要写任何东西
    }

    //@Before注解就是一个前置通知
    //@Before("execution(* com.powernode.spring6.service..*(..))")
    @Before("generalPointCut()")
    public void beforeAdvice(JoinPoint joinPoint){

        System.out.println("前置通知");
        //这个JoinPoint joinPoint在spring容器调用这个方法的时候自动传过来
        //可以直接使用，
        //Signature signature= jointPoint.getSignature();获取目标方法的签名
        //通过方法的签名可以获取一个方法的具体信息
        //获取目标方法的方法名
        System.out.println("目标方法的方法名"+joinPoint.getSignature().getName());

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