package com.powernode.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * packageName com.powernode.proxy.service
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className TimerInvocationHandler
 * @date 2024/6/13
 * @description TODO
 */
//专门负责计时的一个调用处理器对象。
//在这个调用处理器当中编写计时相关的增强代码。
//这个调用处理器只需要写一个就行
public class TimerInvocationHandler implements InvocationHandler {
    private Object target;
    public TimerInvocationHandler(OrderService target) {
        //赋值给成员变量
        this.target=target;
    }

    /*
    * 1、为什么强行必须实现InvocationHandler？
    *   因为一个类实现接口必须要实现接口的方法。
    *   以下这个方法必须是invoke()，因为JDK在底层调用invoke方法的程序已经提前写好了。
    *   注意：invoke方法不是我们程序员负责调用的，是JDK负责调用的
    * 2、invoke什么时候调用？
    *   当代理对象调用代理方法的时候，注册在InvocationHandler调用处理器当中的invoke方法被调用
    * 3、invoke三个参数
    *   invoke方法是JDK负责调用的，所以JDK调用这个方法的时候会自动传过来三个参数
    *   (1) Object proxy 代理对象的引用，用得少
    *   (2) Method method 目标对象上的目标方法(要执行的目标方法就是它)
    *   (3) Object[] args 目标方法上的实参
    *
    *   invoke方法执行过程中，使用method来调用目标对象的目标方法。
    * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //这个接口的目的是为了在这个地方写增强代码
        System.out.println("增强1");
        //调用目标对象上的目标方法
        //方法四要素：那个对象，那个方法，传什么参数，返回什么值
        Object resValue = method.invoke(target, args);
        System.out.println("增强1");
        //invoke方法的返回值，如果代理对象调用代理方法之后，需要返回结果的话，invoke方法必须将
        //目标对象的目标方法
        return resValue;
    }
}