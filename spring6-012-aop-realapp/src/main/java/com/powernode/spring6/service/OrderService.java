package com.powernode.spring6.service;

import org.springframework.stereotype.Service;

/**
 * packageName com.powernode.spring6.service
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className OrderService
 * @date 2024/6/17
 * @description TODO
 */
@Service
public class OrderService {//目标对象
    //目标方法
    public void generate(){
        System.out.println("正在生成订单...");
    }
    public void cancel(){
        System.out.println("订单已取消...");
        //异常代码
        String s =null;
        s.toString();
    }
}