package com.powernode.proxy.service;

/**
 * packageName com.powernode.proxy.service
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className OrderService
 * @date 2024/6/13
 * @description TODO
 */
public interface OrderService {//目标对象和代理对象的公共接口
    /**
     * 生成订单
     */
    void generate();

    /**
     * 查看订单详情
     */
    void detail();

    /**
     * 修改订单
     */
    void modify();
}
