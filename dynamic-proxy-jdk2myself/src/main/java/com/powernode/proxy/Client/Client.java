package com.powernode.proxy.Client;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.OrderServiceImpl;
import com.powernode.proxy.service.TimerInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * packageName com.powernode.proxy.Client
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className Client
 * @date 2024/6/14
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        OrderService orderService = new OrderServiceImpl();
        //创建代理对象 参数包括：
                            // 目标对象的类加载器，
                            // 目标对象的接口，
                            // 调用处理器的对象，一个回调接口，调用这个接口中方法的程序已写好，这里需要一个对象
        OrderService proxy = (OrderService)Proxy.newProxyInstance(orderService.getClass().getClassLoader(),
                                                orderService.getClass().getInterfaces(),
                                                new TimerInvocationHandler(orderService)
                                                );
        //通过代理对象使用目标对象的方法
        proxy.generate();
    }
}