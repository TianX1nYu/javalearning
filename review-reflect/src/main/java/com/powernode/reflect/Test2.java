package com.powernode.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * packageName com.powernode.reflect
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className Test2
 * @date 2024/6/12
 * @description TODO
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        //使用反射机制调用
        //获取类
        Class<?> clazz = Class.forName("com.powernode.reflect.SomeService");

        //获取方法
        Method doSomeMethod = clazz.getDeclaredMethod("doSome", String.class, int.class);

        //调用方法
        //四要素：调用那个对象，什么方法，什么参数，返回什么值
        //Constructor<?> con = clazz.getDeclaredConstructor();
        //Object obj = con.newInstance();

        //obj  哪个对象
        //doSomeMethod 哪个方法
        //"李四", 250  什么参数
        //reValue      返回什么值
        Object obj = clazz.newInstance();
        Object reValue = doSomeMethod.invoke(obj, "李四", 250);
        System.out.println(reValue);
    }
}