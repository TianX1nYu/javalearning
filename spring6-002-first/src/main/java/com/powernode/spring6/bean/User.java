package com.powernode.spring6.bean;

/**
 * packageName com.powernode.spring6.bean
 *这是一个Bean，封装了用户的信息，Spring可以帮助我们创建User对象吗？
 * @author 田鑫宇
 * @version JDK 17
 * @className User
 * @date 2024/6/4
 * @description TODO
 */
public class User {
    public User(){
        //Spring怎样实例化对象？
        //默认情况下是Spring通过反射机制，调用类的无参构造方法来实例化对象
        //实现原理如下：
        // dom4j 解析beans .xml文件，从中获取class的全限定类名
        //通过反射机制调用无参数构造方法创建对象
        //Class clazz = Class.forName ("com.powernode.spring6.bean.User");
        //Object obj = clazz.newInstance();
        System.out.println("User的无参构造方法执行");
    }
}