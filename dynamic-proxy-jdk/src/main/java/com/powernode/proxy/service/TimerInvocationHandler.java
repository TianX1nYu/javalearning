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
    /*
    * 1、为什么强行必须实现InvocationHandler？
    *   因为一个类实现接口必须要实现接口的方法。
    *   以下这个方法必须是invoke()，因为JDK在底层调用invoke方法的程序已经提前写好了。
    *   注意：invoke方法不是我们程序员负责调用的，是JDK负责调用的
    * 2、invoke什么时候调用？
    *   当代理对象调用代理方法的时候，注册在InvocationHandler调用处理器当中的invoke方法被调用*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}