package com.powernode.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * packageName com.powernode.spring6.bean
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className User
 * @date 2024/6/11
 * @description TODO
 */
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean,DisposableBean {
    private String name;

    public User() {
        System.out.println("第一步：无参构造方法执行。");
    }

    public void setName(String name) {
        System.out.println("第二步：给对象的属性赋值。");
        this.name = name;
    }
    //方法自己写，名称随意
    public void initBean(){
        System.out.println("第三步：初始化Bean");
    }
    //第四步，使用Bean

    //方法自己写，名称随意
    public void destroyBean(){
        System.out.println("第五步：销毁Bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("(2)Bean这个类的加载器："+classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("(3)生产这个Bean的工厂对象是"+beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("(1)这个Bean的名字是："+name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean's afterPropertiesSet执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean's destroy执行");
    }
}