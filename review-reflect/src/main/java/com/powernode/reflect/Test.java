package com.powernode.reflect;

/**
 * packageName com.powernode.reflect
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className Test
 * @date 2024/6/12
 * @description TODO
 */
public class Test {
    public static void main(String[] args) {
        //不使用反射机制
        SomeService someService=new SomeService();
        someService.doSome();
        String s1 = someService.doSome("张三");
        System.out.println(s1);
        String s2 = someService.doSome("李四", 250);
        System.out.println(s2);
    }
}