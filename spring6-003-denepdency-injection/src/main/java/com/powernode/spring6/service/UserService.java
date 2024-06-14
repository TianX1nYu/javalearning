package com.powernode.spring6.service;

import com.powernode.spring6.dao.UserDao;

/**
 * packageName com.powernode.spring6.service
 *Bean
 * @author 田鑫宇
 * @version JDK 17
 * @className UserService
 * @date 2024/6/5
 * @description TODO
 */
public class UserService {
    private UserDao userDao;

    //set方法IDEA生成，符合javaBean规范
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(){
        userDao.insert();
    }

}