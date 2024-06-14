package com.powernode.proxy.service;

/**
 * packageName com.powernode.proxy.service
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className OrderServiceProxy
 * @date 2024/6/13
 * @description TODO
 */
//代理对象（代理对象和目标对象有相同的行为，要实现同一个或同一些接口）
//客户端在使用代理对象的时候就像在使用目标对象一样
public class OrderServiceProxy implements OrderService{
    //将目标对象作为代理对象的一个属性，这种关系叫做关联，比继承的耦合度低
    //代理对象中含有目标对象的引用，关联关系。has a
    //注意，这里要写一个公共接口类型，因为公共接口耦合度低
    private OrderService target;//目标对象

    public OrderServiceProxy(OrderService target) {
        this.target=target;
    }

    @Override
    public void generate() {
        //增强
        long begin = System.currentTimeMillis();
        //调用目标对象的目标方法
        target.generate();
        long end   = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");
    }

    @Override
    public void detail() {
        //增强
        long begin = System.currentTimeMillis();
        //调用目标对象的目标方法
        target.detail();
        long end   = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");
    }

    @Override
    public void modify() {
        //增强
        long begin = System.currentTimeMillis();
        //调用目标对象的目标方法
        target.modify();
        long end   = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");
    }
}