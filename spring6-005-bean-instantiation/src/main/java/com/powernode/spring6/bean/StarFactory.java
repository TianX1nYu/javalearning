package com.powernode.spring6.bean;

/**
 * packageName com.powernode.spring6.bean
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className StarFactory
 * @date 2024/6/11
 * @description TODO
 */
public class StarFactory {
    //工厂类中的静态方法。
    //简单工厂模式又叫做：静态工厂方法模式
    public static Star get(){
        //这个Star对象最终实际上创建的时候还是我们负责new的对象
        return new Star();
    }
}