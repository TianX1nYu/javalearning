package com.powernode.proxy.client;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.OrderServiceImpl;
import com.powernode.proxy.service.OrderServiceProxy;

/**
 * packageName com.powernode.proxy.client
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className Test
 * @date 2024/6/13
 * @description TODO
 */
public class Test {
    public static void main(String[] args) {
        //OrderService orderService = new OrderServiceImpl();
        //orderService.generate();
        //orderService.detail();
        //orderService.modify();

        //创建目标对象
        OrderService target = new OrderServiceImpl();
        OrderService proxy = new OrderServiceProxy(target);
        proxy.generate();
        proxy.modify();
        proxy.detail();
    }
}