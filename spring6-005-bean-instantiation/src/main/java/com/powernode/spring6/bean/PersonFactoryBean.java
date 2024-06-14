package com.powernode.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * packageName com.powernode.spring6.bean
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className PersonFactoryBean
 * @date 2024/6/11
 * @description TODO
 */
public class PersonFactoryBean implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        //最终这个Bean的创建还是人为new的
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    //这个方法在接口中默认有实现。默认返回True,返回单例。想多例，重写return false
    @Override
    public boolean isSingleton() {
        return true;
    }
}