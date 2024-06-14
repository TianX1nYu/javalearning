package com.powernode.proxy.client;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.OrderServiceImpl;

import java.lang.reflect.Proxy;

/**
 * packageName com.powernode.proxy.client
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className Client
 * @date 2024/6/13
 * @description TODO
 */
public class Client {
    //客户端程序
    public static void main(String[] args) {
        //创建目标对象
        OrderService target=new OrderServiceImpl();
        //本质上newProxyInstance执行做了两件事：
        //    1、在内存中动态生成了一个代理类的字节码class
        //    2、new了对象。通过内存中生成的代理类这个代码，实例化了代理对象。
        //创建代理对象.三个参数：类加载器，代理类要实现的接口，调用处理器
        //  1、ClassLoader loader
        //  2、Class<?>[] interfaces,
        //  3、InvocationHandler h
        Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),)
    }
}