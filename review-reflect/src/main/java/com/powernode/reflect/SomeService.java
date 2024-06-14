package com.powernode.reflect;

/**
 * packageName com.powernode.reflect
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className SomeService
 * @date 2024/6/12
 * @description TODO
 */
public class SomeService {
    public void doSome(){
        System.out.println("public void doSome执行");
    }
    public String doSome(String s){
        System.out.println("public String doSome(String s)执行");
        return s;
    }
    public String doSome(String s,int i){
        System.out.println("public String doSome(String s,int i)执行");
        return s;
    }
}