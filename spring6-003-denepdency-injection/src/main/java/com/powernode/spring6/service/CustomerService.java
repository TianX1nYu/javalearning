package com.powernode.spring6.service;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.VipDao;

/**
 * packageName com.powernode.spring6.service
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className CustomerService
 * @date 2024/6/6
 * @description TODO
 */
public class CustomerService {
    private UserDao userDao;
    private VipDao vipDao;
    private int age;
    public CustomerService(UserDao userDao,VipDao vipDao){
        this.userDao=userDao;
        this.vipDao=vipDao;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void save(){
        userDao.insert();
        vipDao.insert();
        System.out.println(this.age);
    }
}
