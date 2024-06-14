package com.powernode.proxy.service;

/**
 * packageName com.powernode.proxy.service
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className OrderServiceImpl
 * @date 2024/6/13
 * @description TODO
 */
public class OrderServiceImpl implements OrderService{//目标对象
    @Override
    public void generate() {
        System.out.println("订单已生成");
    }

    @Override
    public void detail() {
        System.out.println("订单已修改");
    }

    @Override
    public void modify() {
        System.out.println("查看订单详情");
    }
}