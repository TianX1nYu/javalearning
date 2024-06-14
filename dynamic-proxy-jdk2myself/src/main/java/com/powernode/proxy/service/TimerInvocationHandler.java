package com.powernode.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * packageName com.powernode.proxy.service
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className TimerInvocationHandler
 * @date 2024/6/14
 * @description TODO
 */
public class TimerInvocationHandler implements InvocationHandler {
    private Object target;

    public TimerInvocationHandler(OrderService orderService) {
        this.target=orderService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("增强1");
        //调用invoke方法
        //调用四要素，那个对象，那个方法，需要传入的参数和返回的参数
        Object result = method.invoke(target, args);
        System.out.println("增强2");
        return result;
    }
}