package com.powernode.reflect;

import java.lang.reflect.Method;

/**
 * packageName com.powernode.reflect
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className Test3
 * @date 2024/6/12
 * @description TODO
 */
public class Test3 {
    public static void main(String[] args) throws Exception{
        //获取类名
        Class<?> Clazz = Class.forName("com.powernode.reflect.SomeService");
        //获取方法
        Method doSomeMethod = Clazz.getDeclaredMethod("doSome", String.class, int.class);
        //调用方法
        Object obj = Clazz.newInstance();
        Object returnValue = doSomeMethod.invoke(obj, "张三", 250);
        System.out.println(returnValue);

    }
}